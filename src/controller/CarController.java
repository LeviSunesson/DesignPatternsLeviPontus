package controller;

import javafx.animation.AnimationTimer;
import abstracts.Car;
import view.CarPane;

public class CarController {

	private Car model;

	public CarController(CarPane cp) {

		
		
		AnimationTimer at = new AnimationTimer() {
			@Override
			public void handle(long now) {
				
				if(!model.isOn) {
					
					model.startEngine();
					
				}
				
				if (model != null) {
					model.move();
					cp.move(model.getPos()[0], model.getPos()[1]);
					cp.update();
				}
			}
		};
		at.start();
	}

	public void setModel(Car v) {
		model = v;
	}

	public void gas(double amount) {
		model.gas(amount);
	}
	
	public void brake(double amount) {
		
		model.brake(amount);
		
	}

}
