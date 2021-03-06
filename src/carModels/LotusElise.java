package carModels;

import abstracts.Car;
import javafx.scene.paint.Color;

public class LotusElise extends Car{
	/**
	 * Creates a red Lotus Elise with 450HP that weighs 725kg.
	 */
	public LotusElise() {
	
		super("Lotus Elise", 450, Color.RED, 725);
	
	}

	/**
	 * speedFactor is calculating the speedFactor of the car. 
	 * @return The speedFactor as a decimal number.
	 */
	@Override
	public double speedFactor() {
		return getEnginePower() * 0.01;
	}

}
