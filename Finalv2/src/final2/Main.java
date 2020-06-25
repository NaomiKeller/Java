package final2;
import java.io.IOException;
import java.util.*;

public class Main {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String choice, cont = "y";
	
	while(cont.equalsIgnoreCase("y")) {
		System.out.println("\t\t PSO2 Player Records v.1.1 \n\n");
        System.out.println("1 - Add new player");
        System.out.println("2 - View all players ");	
        System.out.println("3 - Delete player ");
        System.out.println("4 - Search for player ");
        System.out.println("5 - Update player info ");	
        
        System.out.print("\n");
        System.out.print("----------------------------------------");
        System.out.println("\nEnter your choice: ");
        choice = input.nextLine();
        
        if( choice.equals("1") ) {
        		try {
					Player.AddRecord();
				} catch (IOException e) {
					e.printStackTrace();
				}
        } else if( choice.equals("2") ) {
        		try {
					Player.ViewAllRecord();
				} catch (IOException e) {
					e.printStackTrace();
				}
        } else if( choice.equals("3") ) {
        		try {
					Player.DeleteRecordByName();
				} catch (IOException e) {
					e.printStackTrace();
				}
        } else if( choice.equals("4") ) {
        		try {
					Player.SearchRecordByName();
				} catch (IOException e) {
					e.printStackTrace();
				}
        } else if( choice.equals("5") ) {
        		try {
					Player.updateRecordByName();
				} catch (IOException e) {
					e.printStackTrace();
				}
        }	
	        	
        System.out.println("Do you want to continue? Y/N");
        cont = input.nextLine();
		}
	}
}