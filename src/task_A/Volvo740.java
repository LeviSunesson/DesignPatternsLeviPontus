package task_A;

import javafx.scene.paint.Color;

public class Volvo740 extends Car {

	public final static double trimFactor = 1.25;

	public Volvo740() {
		
		super("Volvo740", 100, Color.RED);
		
	}

	@Override
	public double speedFactor() {
		return enginePower * 0.01 * trimFactor;
	}

}
