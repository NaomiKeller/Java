/*
 * 3 Random Cards
 * Naomi Keller
 * Last updated 10/15/2019
 * Display three random cards from a deck of 52
 */


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import java.util.ArrayList;

public class Ex3 extends Application {
	@Override
	public void start(Stage primaryStage) {
		// List of card numbers
		ArrayList<Integer> cards = getCards();
		
		HBox pane = new HBox(5);
		pane.setPadding(new Insets(5, 5, 5, 5));

		// Add nodes to pane
		for (int i = 0; i < 3; i++) {
			pane.getChildren().add(new ImageView(getClass().getResource(
				cards.get(i) + ".png").toExternalForm()));
		}

		// Stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Ex3");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	// Creating shuffled list of 52 numbers
	private ArrayList<Integer> getCards() {
		ArrayList<Integer> cards = new ArrayList<>();
		for (int i = 0; i < 52; i++) {
			cards.add(i + 1);
		}
		java.util.Collections.shuffle(cards);
		return cards;
	}
	public static void main(String[] args) {
	    Application.launch(args);
	  }
}