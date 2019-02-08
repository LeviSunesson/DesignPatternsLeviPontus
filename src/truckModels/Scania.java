package truckModels;

import abstracts.Truck;
import javafx.scene.paint.Color;

public class Scania extends Truck {

	/**
	 * A version of truck. The Scania is a red truck weighing in at 4000 weight units
	 */
	public Scania() {
		super("Scania", 400, Color.RED, 4000);
	}

	/**
	 * Calculates the speed factor of the car
	 * @return the speed factor
	 */
	@Override
	public double speedFactor() {
		return getEnginePower() * 0.001;
	}

	/**
	 * Raises the flatbed of the truck by a variable amount
	 * @param amount The angle of which to increase the flatbed with
	 */
	public void raise(int amount) {

		if (!this.isMoving()) {
			this.bed.raise(amount);
		}
	}

	/**
	 * Lowers the flatbed of the truck by a variable amount
	 * @param amount The angle of which to decrease the flatbed with
	 */
	public void lower(int amount) {

		if(!this.isMoving()) {
			this.bed.lower(amount);
		}
		
	}

}
