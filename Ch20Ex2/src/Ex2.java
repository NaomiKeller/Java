/*
 * GUI Numbers
 * Naomi Keller
 * 11/7/2019
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import java.util.*;

public class Ex2 extends Application {
	protected TextField textField = new TextField();
	protected TextArea textArea = new TextArea();
	protected LinkedList<Integer> list = new LinkedList<>();
	
	@Override
	public void start(Stage primaryStage) {
		// Create buttons
		Button btSort = new Button("Sort");
		Button btShuffle = new Button("Shuffle");
		Button btReverse = new Button("Reverse");
		
		// Create pane for text field
		HBox paneTextField = new HBox(10);
		paneTextField.getChildren().addAll(
				new Label("Enter a number: "), textField);
		paneTextField.setAlignment(Pos.CENTER);
		
		// Create pane for buttons
		HBox paneButtons = new HBox(5);
		paneButtons.getChildren().addAll(
				btSort, btShuffle, btReverse);
		paneButtons.setAlignment(Pos.CENTER);
		
		// Text area properties
		textArea.setEditable(false);
		textArea.setWrapText(true);
		
		// Create border pane
		BorderPane pane = new BorderPane();
		pane.setTop(paneTextField);
		pane.setCenter(textArea);
		pane.setBottom(paneButtons);
		
		// Handles
		textField.setOnAction(e -> add()); // calls add function
		
		// Sort the list
		btSort.setOnAction(e -> {
			Collections.sort(list);
			displayText();
		});

		// Shuffle the list
		btShuffle.setOnAction(e -> {
			Collections.shuffle(list);
			displayText();
		});
	
		// Reverse the list
		btReverse.setOnAction(e -> {
			Collections.sort(list, Collections.reverseOrder());
			displayText();
		});
	
		// Create a Scene and place it in the stage
		Scene scene = new Scene(pane, 400, 150);
		primaryStage.setTitle("Exercise 2"); // Set the stage title
		primaryStage.setScene(scene); // Place a scene in the stage
		primaryStage.show(); // Display the stage
}

	/** Add an integer to the end of the list */
	private void add() {
		list.addLast(Integer.parseInt(textField.getText()));
		displayText();
	}
	
	/** Display elements in the list in the text area */
	private void displayText() {
		String output = "";
		for (Integer e: list)
			output += e + " ";
	
		textArea.setText(output);
		textField.setText("");
		}
		public static void main(String[] args) {
		    launch(args);
		  }
}

