/* Traffic Light 
 * Naomi Keller
 * Updated 10/29/2019
 * Traffic light simulation. User can select one of the three lights
 * Selected light is turned on.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.geometry.Pos;

public class Ex3 extends Application {
	@Override
	public void start(Stage primaryStage) {
		// Creating shapes
	    Pane lightPane = new Pane();
	    Rectangle tLight = new Rectangle(0, 0, 200 / 3.0, 170);
	    Circle redLight = new Circle(200 / 3.0 / 2, 100 / 6.0, 25);
	    Circle yellowLight = new Circle(100 / 3.0 / 2, 100 / 2.0, 25);
	    Circle greenLight = new Circle(100 / 3.0 / 2, 100 / 6.0 * 3, 25);
	    tLight.setFill(Color.YELLOW);
	    tLight.setStroke(Color.BLACK);
	    tLight.xProperty().bind(lightPane.widthProperty().divide(2).subtract(tLight.getWidth() / 2));
	    tLight.yProperty().bind(lightPane.heightProperty().divide(2).subtract(tLight.getHeight() / 2));
	    redLight.setFill(Color.BLACK);
	    redLight.setStroke(Color.BLACK);
	    redLight.centerXProperty().bind(lightPane.widthProperty().divide(2));
	    redLight.centerYProperty().bind(tLight.yProperty().add(30));
	    yellowLight.setFill(Color.BLACK);
	    yellowLight.setStroke(Color.BLACK);
	    yellowLight.centerXProperty().bind(lightPane.widthProperty().divide(2));
	    yellowLight.centerYProperty().bind(tLight.yProperty().add(85));
	    greenLight.setFill(Color.BLACK);
	    greenLight.setStroke(Color.BLACK);
	    greenLight.centerXProperty().bind(lightPane.widthProperty().divide(2));
	    greenLight.centerYProperty().bind(tLight.yProperty().add(140));

	    lightPane.getChildren().addAll(tLight, redLight, yellowLight, greenLight);
	    
	    // Creating radio buttons
	    RadioButton rbRed = new RadioButton("Red");
	    RadioButton rbYellow = new RadioButton("Yellow");
	    RadioButton rbGreen = new RadioButton("Green");
	    
	    // Grouping radio buttons
	    ToggleGroup tg = new ToggleGroup();
	    rbRed.setToggleGroup(tg);
	    rbYellow.setToggleGroup(tg);
	    rbGreen.setToggleGroup(tg);
	    
	    // Putting rb in HBox
	    HBox controlPane = new HBox(10);
	    controlPane.getChildren().addAll(rbRed, rbYellow, rbGreen);
	    controlPane.setAlignment(Pos.CENTER);

	    BorderPane pane = new BorderPane();
	    pane.setCenter(lightPane);
	    pane.setBottom(controlPane);
	    
	    // Changing colors based on selection
	    rbRed.setOnAction(e -> {
	      redLight.setFill(Color.RED);
	      yellowLight.setFill(Color.BLACK);
	      greenLight.setFill(Color.BLACK);
	    });

	    rbYellow.setOnAction(e -> {
	      redLight.setFill(Color.BLACK);
	      yellowLight.setFill(Color.YELLOW);
	      greenLight.setFill(Color.BLACK);
	    });

	    rbGreen.setOnAction(e -> {
	      redLight.setFill(Color.BLACK);
	      yellowLight.setFill(Color.BLACK);
	      greenLight.setFill(Color.GREEN);
	    });
	    
	    // Scene\stage creation
	    Scene scene = new Scene(pane, 500, 300);
	    primaryStage.setTitle("Exercise 3");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	  }

	  public static void main(String[] args) {
	    launch(args);
	  }
	}