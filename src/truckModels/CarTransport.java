package truckModels;

import abstracts.Car;
import abstracts.Truck;
import interfaces.Tow;
import javafx.scene.paint.Color;

public class CarTransport extends Truck implements Tow{

	public CarTransport(String model, int enginePower, Color color) {
	
		super(model, enginePower, color, 7000, 4);
	
	}

	@Override
	public double speedFactor() {
		return getEnginePower() * 0.001;
	}

	@Override
	public void carry(Car newLoad) {
		
		this.loadBed(newLoad);
		
	}

}