package view;

import controller.CarController;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class ButtonBox extends HBox {

	private CarController controller;
	private Spinner<Integer> spinner;
	private Button gasButton;
	private Button brakeButton;
	private Button leftTurnButton;
	private Button rightTurnButton;

	public ButtonBox(CarController cc) {
		this.controller = cc;
		setStyle();
		addComponents();
		addEventListeners();
		
		System.out.println(this.getBoundsInParent().getHeight());
		
	}

	private void addEventListeners() {
		gasButton.setOnAction(e -> {
			controller.gas(spinner.getValue() / 100.0);
		});
		
		brakeButton.setOnAction(e ->{
			
			controller.brake(spinner.getValue() / 100.0);
			
		});
		
		leftTurnButton.setOnAction(e ->{
			
			controller.turn("left");
			
		});
		
		rightTurnButton.setOnAction(e ->{
			
			controller.turn("right");
			
		});
		
		
	}

	private void addComponents() {
		VBox container = new VBox();
		HBox spinnerBox = new HBox();
		HBox buttonsBox = new HBox();

		spinner = new Spinner<Integer>(0, 100, 50);
		spinner.setEditable(true);

		gasButton = new Button("Gas");
		gasButton.setPrefSize(100, 20);

		brakeButton = new Button("Brake");
		brakeButton.setPrefSize(100, 20);
		
		rightTurnButton = new Button("Turn right");
		rightTurnButton.setPrefSize(100, 20);
		
		leftTurnButton = new Button("Turn left");
		leftTurnButton.setPrefSize(100, 20);

		spinnerBox.getChildren().addAll(spinner);
		buttonsBox.getChildren().addAll(gasButton, brakeButton, leftTurnButton, rightTurnButton);
		container.getChildren().addAll(spinnerBox, buttonsBox);

		this.getChildren().addAll(container);

	}

	private void setStyle() {
		this.setPadding(new Insets(15, 12, 15, 12));
		this.setSpacing(10);
		this.setStyle("-fx-background-color: #336699;");
	}

}
