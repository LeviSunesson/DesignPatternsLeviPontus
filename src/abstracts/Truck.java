package abstracts;

import javafx.scene.paint.Color;
import truckModels.Flatbed;

public abstract class Truck extends Car {

	protected Flatbed bed;
	
	public Truck(String model, int enginePower, Color color, int weight, int capacity) {
		super(model, enginePower, color, weight);
		
		bed = new Flatbed();
	
	}

	@Override
	public void startEngine() {
		
		if(this.getBedDown()) {
			
			currentSpeed = 0.01;
			
		}
		
	}
	
	public boolean getBedDown() {
		
		return bed.isDown();
		
	}
	
}
