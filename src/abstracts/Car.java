package abstracts;

import interfaces.Movable;
import javafx.scene.paint.Color;

/**
 * An abstract class for creating a car. It can be accelerated and can be stopped.
 * The car has a position, speed and a angle. You can give it a color and a name.
 * @author Levi Sunesson & Pontus Fransson.
 *
 */
public abstract class Car implements Movable {

	private double enginePower; // Engine power of the car.
	protected double currentSpeed; // The current speed of the car.
	private Color color; // Color of the car.
	private String modelName; // The car model name.
	private int carWeight; // The weight of the car. 
	private boolean isOn = false;

	private double[] position = {0, 0}; // The position of the car in {x, y}
	private int angle = 0; // The angle (direction) of the car, 0 through 3.

	/**
	 * Creates a car with a 
	 * @param model The modelname of the car.
	 * @param enginePower The power of the engine.
	 * @param color The color of the car.
	 * @param weight The weight of the car. 
	 */
	public Car(String model, int enginePower, Color color, int weight){

		this.color = color;
		this.enginePower = enginePower;
		modelName = model;
		carWeight = weight;
		stopEngine();

	}

	/**
	 * @return The weight of the vehicle in Kilograms. 
	 */
	public int getWeight() {

		return carWeight;

	}
	
	/**
	 * Returns the name of the cars model
	 * @return The name of the model
	 */
	public String getModel() {
		
		return modelName;
		
	}

	/**
	 *  Adds weight to the car
	 * @param amount the amount of weight (weightunit)
	 */
	public void addWeight(int amount) {

		carWeight += amount;

	}

	/**
	 *  Removes weight from the car
	 * @param amount the amount of weight (weightunit)
	 */
	public void removeWeight(int amount) {

		carWeight -= amount;

	}

	/**
	 * Moves the car depending on the angle and currentSpeed.
	 */
	public void move() {

		double change = currentSpeed;

		change = (angle < 2) ? currentSpeed : currentSpeed * -1;

		if(angle%2 == 0)
			position[0] += change;
		else
			position[1] += change;

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
		isOn = true;
	}

	/**
	 * Stops the engine of the car
	 */
	public void stopEngine() {
		currentSpeed = 0;
		isOn = false;
	}

	public boolean isMoving() {

		return (currentSpeed <= 0) ?  false : true;

	}

	/**
	 * Calculates the speed factor of the car
	 * @return the speed factor
	 */
	public abstract double speedFactor();

	/**
	 * Increments the current speed of the car depending of the speed factor, unless the car is at max Speed
	 * @param amount The amount of incrementing to be given
	 */
	private void incrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() + speedFactor() * amount;

		if(currentSpeed > getEnginePower())
			currentSpeed = getEnginePower();
	}

	/**
	 * Decrements the current speed of the car depending of the speed factor, unless the car is standing still
	 * @param amount The amount of decrementing to be given
	 */
	private void decrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() - speedFactor() * amount;

		if (currentSpeed < 0) {
			currentSpeed = 0;
		}
	}

	/**
	 * Accelerates the car depending on the amount
	 * @param amount The amount of acceleration to be done ( bound between 0 - 1 )
	 */
	public void gas(double amount) {

		if (this.isOn) {

			if (amount > 1) {
				amount = 1;
			}

			if (amount < 0) {
				amount = 0;
			}

			incrementSpeed(amount);
		}

	}

	/**
	 * Decelerates the car depending on the amount
	 * @param amount The amount of acceleration to be done ( bound between 0 - 1 )
	 */
	public void brake(double amount) {

		if (amount > 1) {
			amount = 1;
		}

		if (amount < 0) {
			amount = 0;
		}

		decrementSpeed(amount);			

	}
	
	/**
	 * Returns the position of the car in a 2d array
	 * @return the array
	 */
	public double[] getPos() {
		
		return position;
		
	}
}
