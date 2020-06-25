/*
 * Audio Player
 * Naomi Keller
 * Updated 10/29/2019
 * Play, stop, and loop audio clip
 * I wasn't sure what clip we were supposed to use or where to find it so I
 * just used a drumbreak sample from one of my music sample packs.
 * 
 * I actually think there could be a use case for a program like this for me:
 * Often times I just want to browse my samples (which are often 1 or 2 bars long) without
 * importing them into my DAW, and my DAW doesn't loop the samples in the browser.
 * So if there's a way to make the program stay on beat on the loop it would be a good
 * way to hear how the sample would sound looped / repeated. Importing audio would have to be easier too, obviously.
 */
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.media.AudioClip;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import java.io.File;

public class Ex22 extends Application {
  @Override
  public void start(Stage primaryStage) {
	// Create button
    Button btPlay = new Button("Play");
    Button btLoop = new Button("Loop");
    Button btStop = new Button("Stop");
    
    // Get audio file
    File file = new File("drumbreak.wav");
    AudioClip audio = new AudioClip(file.toURI().toString());
    
    // Play button actions
    btPlay.setOnAction(e -> {
      audio.stop();
      audio.setCycleCount(1);
      audio.play();
    });
    // Loop button actions
    btLoop.setOnAction(e -> {
      audio.stop();
      audio.setCycleCount(AudioClip.INDEFINITE);
      audio.play();
    });
    // Stop button actions
    btStop.setOnAction(e -> audio.stop());
    
    // HBox for buttons
    HBox pane = new HBox(10);
    pane.getChildren().addAll(btPlay, btLoop, btStop);
    pane.setPadding(new Insets(20));
    pane.setAlignment(Pos.CENTER);
    
    // Create scene
    Scene scene = new Scene(pane);
    primaryStage.setTitle("Exercise 22");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}