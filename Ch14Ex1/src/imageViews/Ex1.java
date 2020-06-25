/*
  Write a program that displays four images in a grid pane.
*/
/*
  Write a program that displays four images in a grid pane.
*/
package imageViews;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class Ex1 extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Image flagUSA = new Image("file:us.gif");
        Image flagEngland = new Image("file:uk.gif");
        Image flagCanada = new Image("file:ca.gif");
        Image flagChina = new Image("file:china.gif");

        ImageView imageViewUSA = new ImageView(flagUSA);
        ImageView imageViewEngland = new ImageView(flagEngland);
        ImageView imageViewCanada = new ImageView(flagCanada);
        ImageView imageViewChina = new ImageView(flagChina);

        GridPane pane = new GridPane();
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);
        pane.add(imageViewEngland, 0, 0);
        pane.add(imageViewCanada, 1, 0);
        pane.add(imageViewChina, 0, 1);
        pane.add(imageViewUSA, 1, 1);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Exercise14_01");
        primaryStage.show();
    }
}