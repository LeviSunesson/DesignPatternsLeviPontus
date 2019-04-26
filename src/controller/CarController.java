package controller;

import javafx.animation.AnimationTimer;
import main.App;
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
					
					if(model.getPos()[0] + cp.w >= App.WIDTH) {
						
						model.turnRight();
						model.turnRight();
						
					}else if(model.getPos()[0] <= 0) {
						
						model.turnRight();
						model.turnRight();
							
					}
					
					if(model.getPos()[1] + cp.w >= App.HEIGHT - 44) {
						
						model.turnRight();
						model.turnRight();
						
					}else if(model.getPos()[1] <= 0) {
						
						model.turnRight();
						model.turnRight();
					
					}
					
					model.move();
					
					cp.move(model.getPos()[0], model.getPos()[1], model.getAngle());
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
	
	public void turn(String direction) {
	
		if(direction == "left") {
			
			model.turnLeft();
			
		}else if(direction == "right") {
		
			model.turnRight();
		
		}else {
			
			System.out.println("Invalid direction");
			
		}
	
	}

}
