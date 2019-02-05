package truckModels;

import abstracts.Truck;
import javafx.scene.paint.Color;

public class Scania extends Truck {

	public Scania() {
		super("Scania", 75, Color.RED, 4000);
	}

	@Override
	public double speedFactor() {
		// TODO Auto-generated method stub
		return 0;
	}

}
