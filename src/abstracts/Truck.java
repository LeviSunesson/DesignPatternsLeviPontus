package abstracts;

import javafx.scene.paint.Color;
import truckModels.Flatbed;

public abstract class Truck extends Car {

	private Flatbed bed;
	
	public Truck(String model, int enginePower, Color color, int weight, int capacity) {
		super(model, enginePower, color, weight);
		
		bed = new Flatbed(capacity);
	
	}
	
	public boolean getBedDown() {
		
		return bed.isDown();
		
	}
	
	public void higherBed() {
		
		bed.higher(5);
		
	}
	
	public void lowerBed() {
		
		bed.lower(5);
		
	}

	public void loadBed(Car newCargo) {
		
		bed.load(newCargo);
		
	}
	
}
