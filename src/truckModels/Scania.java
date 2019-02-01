package truckModels;

import abstracts.Truck;
import javafx.scene.paint.Color;

public class Scania extends Truck {

	public Scania(String model, int enginePower, Color color) {
		super(model, enginePower, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double speedFactor() {
		// TODO Auto-generated method stub
		return 0;
	}

}
