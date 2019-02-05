package truckModels;

import abstracts.Truck;
import javafx.scene.paint.Color;

public class Scania extends Truck {

	public Scania() {
		super("Scania", 400, Color.RED, 4000, 0);
	}

	@Override
	public double speedFactor() {
		return getEnginePower() * 0.001;
	}

}
