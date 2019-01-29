package task_A;

import javafx.scene.paint.Color;

public abstract class Car implements Movable {

	private double enginePower; // Engine power of the car
	private double currentSpeed; // The current speed of the car
	private Color color; // Color of the car
	private String modelName; // The car model name
	
	private double[] position = {0, 0}; // The position of the car in {x, y}
	private int angle = 0; // The angle (direction) of the car, 0 through 3
	
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
	
	/**
	 * Moves the car depending on the angle and currentSpeed
	 */
	public void move() {
		
		switch (angle) {
		case 0:
			position[0] += currentSpeed;
			break;
		case 1:
			position[1] += currentSpeed;
			break;
		case 2:
			position[0] += currentSpeed;
			break;
		case 3:
			position[1] += currentSpeed;
			break;
		default:
			break;
		}
		
	}
	
	/**
	 * Decrements the angle one step
	 */
	public void turnLeft() {
		
		angle--;	
		
		angle = (angle == -1) ? 3 : angle;
		// true ( left ) : false ( right )
	}
	
	/**
	 * Increments the angle one step
	 */
	public void turnRight() {
		
		angle++;
		
		angle = (angle == 4) ? 0 : angle;
		
	}
	
	/**
	 * Fetches the Engine power of the car
	 * @return The engine power of the car as a decimal number
	 */
	public double getEnginePower() {
		return enginePower;
	}

	/**
	 * Fetches the current speed of the car
	 * @return the current speed as a decimal number
	 */
	public double getCurrentSpeed() {
		return currentSpeed;
	}

	/**
	 * Returns the color of the car as a JavaFX color
	 * @return The color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Starts the engine of the car
	 */
	public void startEngine() {
		currentSpeed = 0.1;
	}

	/**
	 * Stops the engine of the car
	 */
	public void stopEngine() {
		currentSpeed = 0;
	}
	
	/**
	 * Calculates the speed factor of the car
	 * @return the speed factor
	 */
	public abstract double speedFactor();
	
	/**
	 * Increments the current speed of the car depending of the speed factor
	 * @param amount The amount of incrementing to be given
	 */
	private void incrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() + speedFactor() * amount;
	}
	
	/**
	 * Decrements the current speed of the car depending of the speed factor
	 * @param amount The amount of decrementing to be given
	 */
	private void decrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() - speedFactor() * amount;
	}

	/**
	 * Accelerates the car depending on the amount
	 * @param amount The amount of acceleration to be done
	 */
	public void gas(double amount) {
		incrementSpeed(amount);
	}

	/**
	 * Decelerates the car depending on the amount
	 * @param amount The amount of acceleration to be done
	 */
	public void brake(double amount) {
		decrementSpeed(amount);
	}
}
