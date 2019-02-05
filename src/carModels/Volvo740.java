package carModels;

import abstracts.Car;
import javafx.scene.paint.Color;

public class Volvo740 extends Car {

	public final static double trimFactor = 1.25; // Used to increase the speedFactor.

	/**
	 * Creates a red Volvo 740 with 100HP.
	 */
	public Volvo740() {
		
		super("Volvo740", 100, Color.RED, 1400);
		
	}

	/**
	 * speedFactor is calculating the speedFactor depending on trimFactor.
	 * @return The enginePower as a decimal number.
	 */
	@Override
	public double speedFactor() {
		return getEnginePower() * 0.01 * trimFactor;
	}

}
