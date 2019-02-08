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

	public void raise(int amount) {

		if (!this.isMoving()) {
			this.bed.raise(amount);
		}
	}

	public void lower(int amount) {

		if(!this.isMoving()) {
			this.bed.lower(amount);
		}
		
	}

}
