package task_A;

import javafx.scene.paint.Color;

public class Saab95 extends Car {

	public boolean turboOn; // State of turbo

	/**
	 * Creates a Saab 9 5 from the car abstract
	 */
	public Saab95() {
		
		super("Saab95", 125, Color.BLACK);		
		turboOn = false;
		
	}
	/**
	 * Turns turbo on
	 */
	private void setTurboOn() {
		turboOn = true;
	}
	/**
	 * Turns turbo off
	 */
	private void setTurboOff() {
		turboOn = false;
	}

	/**
	 * speedFactor is calculating the speedFactor of the car depending on the state of turbo
	 * @return The speed factor as a decimal number
	 */
	@Override
	public double speedFactor() {
		double turbo = 1;
		if (turboOn)
			turbo = 1.3;
		return getEnginePower() * 0.01 * turbo;
	}

}