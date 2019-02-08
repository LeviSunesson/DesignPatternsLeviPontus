package truckModels;

import abstracts.Truck;
import javafx.scene.paint.Color;

public class CarTransport extends Truck{

	public CarTransport(String model, int enginePower, Color color) {
	
		super(model, enginePower, color, 7000, 4);
	
	}

	@Override
	public double speedFactor() {
		return getEnginePower() * 0.001;
	}

	public void openBed() {
		
		this.bed.open();
		
	}
	
	public void closeBed() {
		
		this.bed.close();
		
	}
	
}