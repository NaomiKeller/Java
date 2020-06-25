/*
 * Scrolling Text
 * Naomi Keller
 * 10/17/2019
 */

import javafx.application.Application;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Ex27 extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane
		Pane pane = new Pane();

		// Create a text
		Text text = new Text("Programing is fun ");
		text.setFont(Font.font("Verdana", 20));
		
		pane.getChildren().add(text);
		

		// Create a path transition
		PathTransition pt = new PathTransition(Duration.millis(10000), 
			new Line(-50, 50, 250, 50), text);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.play(); // Start animation

		// Create and register the handle
		pane.setOnMousePressed(e -> {
			pt.pause();
		});

		pane.setOnMouseReleased(e -> {
			pt.play();
		});

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 200, 100);
		primaryStage.setTitle("Exercise_15_27"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}
	public static void main(String[] args) {
	    Application.launch(args);
	  }
}