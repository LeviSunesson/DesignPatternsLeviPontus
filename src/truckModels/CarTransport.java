package truckModels;

import abstracts.Truck;
import interfaces.Tow;
import javafx.scene.paint.Color;

public class CarTransport extends Truck implements Tow{

	public CarTransport(String model, int enginePower, Color color) {
		super(model, enginePower, color, 7000);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double speedFactor() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void carry(int capacity) {
		// TODO Auto-generated method stub
		
	}

}
