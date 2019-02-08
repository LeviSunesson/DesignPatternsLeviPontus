package carModels;

import abstracts.Car;
import javafx.scene.paint.Color;

public class Tesla_ModelS extends Car{
	
	public boolean ludicrousOn;//State of Ludicrous mode.
	/**
	 * Creates a Darkred Tesla Model S with 700HP that weighs 2250kg.
	 * Also, Turns Ludicrous mode off by default.
	 */
	public Tesla_ModelS(){
		super("Tesla Model S", 700, Color.DARKRED, 2250);
		ludicrousOn = false;
	}
	/**
	 * Turns Ludicrous mode on.
	 */
	private void setLudicrousOn() {
		ludicrousOn = true;
	}
	/**
	 * Turns Ludicrous mode off.
	 */
	private void setLudicrousOff() {
		ludicrousOn = false;
	}
	/**
	 * speedFactor is calculating the speedFactor of the car depending on the state of
	 * Ludicrous mode.
	 * @return The speed factor as a decimal number.
	 */
	@Override
	public double speedFactor() {
		double boost = 1;
		if (ludicrousOn)
			boost = 1.07;
		return getEnginePower() * 0.01 * boost;
	}

	/**
	 * Because it's an electric car it starts in 10 speedunits. 
	 */
	@Override
	public void startEngine() {
		
		currentSpeed = 10;
		
	}
	
}
