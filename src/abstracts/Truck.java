package abstracts;

import javafx.scene.paint.Color;
import truckModels.Flatbed;

public abstract class Truck extends Car {
	
	protected Flatbed bed; // The flatbed of the truck
	
	/**
	 * A truck is a special version of a car that is larger and has a flatbed
	 * @param model The name of the model
	 * @param enginePower The power of the engine 
	 * @param color The color of the truck
	 * @param weight The weight of the truck
	 */
	public Truck(String model, int enginePower, Color color, int weight) {
		super(model, enginePower, color, weight);
		
		bed = new Flatbed();
	
	}

	/**
	 * The starting of the engine
	 */
	@Override
	public void startEngine() {
		
		if(this.getBedDown()) {
			
			currentSpeed = 0.01;
			
		}
		
	}
	
	/**
	 * Checks if the flatbed of the truck is down.
	 * @return If the bed is down it returns true
	 */
	public boolean getBedDown() {
		
		return bed.isDown();
		
	}
	
}
