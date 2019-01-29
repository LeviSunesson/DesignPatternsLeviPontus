package task_A;

import javafx.scene.paint.Color;

public abstract class Car implements Movable{

	private double enginePower; // Engine power of the car
	private double currentSpeed; // The current speed of the car
	private Color color; // Color of the car
	private String modelName; // The car model name
	
	private double[] position;
	private double angleInRad;
	
	/**
	 * Creates a car with a 
	 * @param model The modelname of the car
	 * @param enginePower The power of the engine
	 * @param color The color of the car
	 */
	public Car(String model, int enginePower, Color color){
		
		this.color = color;
		this.enginePower = enginePower;
		modelName = model;
		stopEngine();
		
	}
	
	public void move() {
		
	}
	
	public void turnLeft() {
		
	}
	
	public void turnRight() {
		
		
	}
	
	public double getEnginePower() {
		return enginePower;
	}

	public double getCurrentSpeed() {
		return currentSpeed;
	}

	public Color getColor() {
		return color;
	}

	private void startEngine() {
		currentSpeed = 0.1;
	}

	public void stopEngine() {
		currentSpeed = 0;
	}
	
	public abstract double speedFactor();
	
	private void incrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() + speedFactor() * amount;
	}

	private void decrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() - speedFactor() * amount;
	}

	public void gas(double amount) {
		incrementSpeed(amount);
	}

	public void brake(double amount) {
		decrementSpeed(amount);
	}
}
