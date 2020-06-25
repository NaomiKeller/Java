package final2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Player {
	// Add records
	public static void AddRecord() throws IOException {	

		BufferedWriter bw = new BufferedWriter( new FileWriter("players.txt",true) );
		Scanner strInput = new Scanner(System.in);

		String name, lvlStr, raceMenu, classMenu;
		String race = null; // Default value
	    String classP = null; 
	    int lvl = 0;
	    
		System.out.print("Enter player name: ");
		name = strInput.nextLine();
		
		// Class selection menu
		while (classP == null) {
			System.out.print("----------------------------------------");
			System.out.print("\nEnter player class: ");
			System.out.print("\n Choices: "
					+ "\n Hu (Hunter)"
					+ "\n Fi (Fighter)"
					+ "\n Ra (Ranger)"
					+ "\n Fo (Force)"
					+ "\n Gu (Gunner)"
					+ "\n Te (Techer)"
					+ "\n Br (Braver)"
					+ "\n Bo (Bouncer)"
					+ "\n Su (Summoner)");
			System.out.print("\n: ");
			classMenu = strInput.nextLine();
			if (classMenu.equalsIgnoreCase("Hu")) {
				classP = "Hunter";
			} else if (classMenu.equalsIgnoreCase("Ra")) {
				classP = "Ranger";
			} else if (classMenu.equalsIgnoreCase("Fo")) {
				classP = "Force";
			} else if (classMenu.equalsIgnoreCase("Fi")) {
				classP = "Fighter";
			} else if (classMenu.equalsIgnoreCase("Gu")) {
				classP = "Gunner";
			} else if (classMenu.equalsIgnoreCase("Te")) {
				classP = "Techer";
			} else if (classMenu.equalsIgnoreCase("Br")) {
				classP = "Braver";
			} else if (classMenu.equalsIgnoreCase("Bo")) {
				classP = "Bouncer";
			} else if (classMenu.equalsIgnoreCase("Su")) {
				classP = "Summoner";
			} else {
				classP = null;
				System.out.println("ERROR: Class does not exist!");
			}
			
		}
		
		while (lvl < 1 || lvl > 90) {
			System.out.print("----------------------------------------");
			System.out.print("\nEnter player level (1-90): ");
			lvlStr = strInput.nextLine();
			lvl = Integer.parseInt(lvlStr);
		}
		
		// Race selection menu
		while (race == null) {
			System.out.print("----------------------------------------");
			System.out.print("\nEnter player race - ");
			System.out.print("\n C = CAST, H = Human, N = Newman, D = Dewman: ");
			raceMenu = strInput.nextLine();   
			if (raceMenu.equalsIgnoreCase("C")) {
				race = "CAST";
			} else if (raceMenu.equalsIgnoreCase("H")) {
				race = "Human";
			} else if (raceMenu.equalsIgnoreCase("N")) {
				race = "Newman";
			} else if (raceMenu.equalsIgnoreCase("D")) {
				race = "Dewman";
			} else {
				race = null;
				System.out.println("ERROR: Race does not exist!");
			}
		}
		bw.write(name+","+classP+","+lvl+","+race);
		bw.flush();
		bw.newLine();
		bw.close();	
	}
	
	// Setter method for viewing
	public static void ViewAllRecord() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("players.txt"));
		
		String record;
		
		System.out.println(" ----------------------------------------- ");
    	System.out.println("	Name - Class - Level - Race      ");
    	System.out.println(" ----------------------------------------- ");
    	
    	while((record = br.readLine()) != null ) {
    		StringTokenizer st = new StringTokenizer(record,",");
    		System.out.println("      "+st.nextToken()+" - "+st.nextToken()+" - "+st.nextToken()+" - "+st.nextToken()+" ");
    		
    	}
    		
    	System.out.println(" ----------------------------------------- ");
    	br.close();  
    	
	}
	
	// Setter method for deletion
	public static void DeleteRecordByName() throws IOException {
		Scanner strInput = new Scanner(System.in);
		String name, record;
		
		File tempDB = new File("players_temp.txt");
		File db = new File("players.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(db));
		BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));
		
		System.out.println("\t\t Delete Player Record \n");
		
		System.out.println("Enter player name: ");
		name = strInput.nextLine();
		
		while ((record = br.readLine()) != null) {
			if(record.contains(name))
				continue;
			bw.write(record);
			bw.flush();
			bw.newLine();
		}
		
		br.close();
		bw.close();
		db.delete();
		
		tempDB.renameTo(db);
		
	}
	
	// Setter for searching by name
	public static void SearchRecordByName() throws IOException {
		String name, record;
		Scanner strInput = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new FileReader("players.txt"));
		
		System.out.println("\t\t Search Player Record\n");
		
		System.out.println("Enter player name: ");
		name = strInput.nextLine();
		
		System.out.println(" ----------------------------------------- ");
    	System.out.println("	Name - Class - Level - Race      ");
    	System.out.println(" ----------------------------------------- ");
    	
    	while ((record = br.readLine()) != null) {
    		StringTokenizer st = new StringTokenizer(record,",");
    		if( record.contains(name) ) {
    			System.out.println("      "+st.nextToken()+" - "+st.nextToken()+" - "+st.nextToken()+" - "+st.nextToken()+" ");
			}
    	}
    	System.out.println(" ----------------------------------------- ");
		
		br.close();
	}
	
	// Setter to update record
	public static void updateRecordByName() throws IOException {
		String newName, lvlStr, classMenu, record, name, record2, raceMenu;
		String newRace = null;
		String newClass = null;
		int newLvl = 0;
		
		
		File db = new File("players.txt");
		File tempDB = new File("players_temp.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(db));
		BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));
		
		Scanner strInput = new Scanner(System.in);
		
		System.out.println("\t\t Update Player Record\n\n");
		
		System.out.println("Enter player name: ");
			name = strInput.nextLine();
			System.out.println(" ----------------------------------------- ");
	    	System.out.println("	Name - Class - Level - Race      ");
	    	System.out.println(" ----------------------------------------- ");
	    	
	    	while ((record = br.readLine()) != null ) {
	    		StringTokenizer st = new StringTokenizer(record,",");
	    		if (record.contains(name)) {
	    			System.out.println("      "+st.nextToken()+" - "+st.nextToken()+" - "+st.nextToken()+" - "+st.nextToken()+" ");
	    		}
	    	}
	    	System.out.println(" ----------------------------------------- ");
			
		br.close();
		
		System.out.println("Enter a new name: ");
		newName = strInput.nextLine();

		// Class selection menu
		while (newClass == null) {
			System.out.print("----------------------------------------");
			System.out.print("\nEnter new player class: ");
			System.out.print("\n Choices: "
					+ "\n Hu (Hunter)"
					+ "\n Fi (Fighter)"
					+ "\n Ra (Ranger)"
					+ "\n Fo (Force)"
					+ "\n Gu (Gunner)"
					+ "\n Te (Techer)"
					+ "\n Br (Braver)"
					+ "\n Bo (Bouncer)"
					+ "\n Su (Summoner)");
			System.out.print("\n: ");
			classMenu = strInput.nextLine();
			if (classMenu.equalsIgnoreCase("Hu")) {
				newClass = "Hunter";
			} else if (classMenu.equalsIgnoreCase("Ra")) {
				newClass = "Ranger";
			} else if (classMenu.equalsIgnoreCase("Fo")) {
				newClass = "Force";
			} else if (classMenu.equalsIgnoreCase("Fi")) {
				newClass = "Fighter";
			} else if (classMenu.equalsIgnoreCase("Gu")) {
				newClass = "Gunner";
			} else if (classMenu.equalsIgnoreCase("Te")) {
				newClass = "Techer";
			} else if (classMenu.equalsIgnoreCase("Br")) {
				newClass = "Braver";
			} else if (classMenu.equalsIgnoreCase("Bo")) {
				newClass = "Bouncer";
			} else if (classMenu.equalsIgnoreCase("Su")) {
				newClass = "Summoner";
			} else {
				newClass = null;
				System.out.println("ERROR: Class does not exist!");
			}
					
		}
		
		// Level selection
		while (newLvl < 1 || newLvl > 90) {
			System.out.print("----------------------------------------");
			System.out.print("\nEnter new player level (1-90): ");
			lvlStr = strInput.nextLine();
			newLvl = Integer.parseInt(lvlStr);
		}
		
		// Race selection
		while (newRace == null) {
			System.out.print("Enter new player race - ");
			System.out.print("\n C = CAST, H = Human, N = Newman, D = Dewman: ");
			raceMenu = strInput.nextLine();   
			if (raceMenu.equalsIgnoreCase("C")) {
				newRace = "CAST";
			} else if (raceMenu.equalsIgnoreCase("H")) {
				newRace = "Human";
			} else if (raceMenu.equalsIgnoreCase("N")) {
				newRace = "Newman";
			} else if (raceMenu.equalsIgnoreCase("D")) {
				newRace = "Dewman";
			} else {
				newRace = null;
				System.out.println("ERROR: Incorrect input");
			}
		}
		
		// Write from temp file to main file
		BufferedReader br2 = new BufferedReader(new FileReader(db));
		
		while ((record2 = br2.readLine()) != null) {
			if (record2.contains(name)) {
				bw.write(newName+","+newClass+","+newLvl+","+newRace);
			} else {
				bw.write(record2);
			}
			bw.flush();
			bw.newLine();
		}
		
		bw.close();
		br2.close();
		db.delete();
		boolean success = tempDB.renameTo(db);
		if (success == true) {
			System.out.println("Success!"); 
			}
		else {
			System.out.println("Unable to update record.");
		}
	}
}
