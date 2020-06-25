/*
 * Investment-Value Calculator
 * Naomi Keller
 * Last Updated 10/17/2019
 * GUI program for calculating future value of an investment
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class Ex5 extends Application {
	// Text fields
	private TextField tfInvestmentAmount = new TextField();
	private TextField tfNumberOfYears = new TextField();
	private TextField tfAnnualInterest = new TextField();
	private TextField tfFutureValue = new TextField();
	// Button calls for calculation for output
	private Button btCalc = new Button("Calculate");
	
	@Override // Overriding start method
	public void start(Stage primaryStage) {
		// Creating UI
		GridPane pane = new GridPane();
		pane.setVgap(5);
		pane.setHgap(5);
		pane.add(new Label("Investment Amount:"), 0, 0);
		pane.add(tfInvestmentAmount, 1, 0);
		pane.add(new Label("Number Of Years:"), 0, 1);
		pane.add(tfNumberOfYears, 1, 1);
		pane.add(new Label("Annual Interest Rate:"), 0, 2);
		pane.add(tfAnnualInterest, 1, 2);
		pane.add(new Label("Future value:"), 0, 3);
		pane.add(tfFutureValue, 1, 3);
		pane.add(btCalc, 1, 4);
		
		// Set UI properties
		pane.setAlignment(Pos.CENTER);
		tfInvestmentAmount.setAlignment(Pos.BOTTOM_RIGHT);
		tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
		tfAnnualInterest.setAlignment(Pos.BOTTOM_RIGHT);
		tfFutureValue.setAlignment(Pos.BOTTOM_RIGHT);
		tfFutureValue.setEditable(false);
		GridPane.setHalignment(btCalc, HPos.RIGHT);
		pane.setPadding(new Insets(10, 10, 10, 10));
		
		// Event
		btCalc.setOnAction(e -> futureValue());
		
		// Create scene - place on stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise 15.5");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private void futureValue() {
		double investAmount = Double.parseDouble(tfInvestmentAmount.getText());
		int years = Integer.parseInt(tfNumberOfYears.getText());
		double monthlyInterestRate = 
				Double.parseDouble(tfAnnualInterest.getText()) / 1200;
		tfFutureValue.setText(String.format("$%.2f",
				(investAmount * Math.pow(1 + monthlyInterestRate, years * 12))));
	}
	public static void main(String[] args) {
	    Application.launch(args);
	  }

}
