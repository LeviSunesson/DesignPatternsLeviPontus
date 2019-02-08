package truckModels;

import abstracts.Car;
import abstracts.Truck;
import interfaces.CarLoader;
import javafx.scene.paint.Color;


public class CarTransport extends Truck{

	private CarLoader loader; // The CarLoader of the Truck

	/**
	 * A car transporter for transporting cars on land
	 */
	public CarTransport() {

		super("CarTransport", 100, Color.DARKGRAY, 7000);
		loader = new CarLoader(4, 2500);

	}

	/**
	 * Loads a single car onto the truck's car bay
	 * @param newCargo The car to load
	 */
	public void load(Car newCargo) {

		if(newCargo != this) {

			loader.load(newCargo);
			this.addWeight(newCargo.getWeight());

		}

	}

	/**
	 * Unloads a car from the truck's car bay
	 * @return The that is being unloaded
	 */
	public Car unLoad() {

		this.removeWeight(loader.getLoadWeight(-1));

		return loader.unLoad(false);

	}

	/**
	 * Raises the flatbed of the truck by a variable amount
	 * @param amount The angle of which to increase the flatbed with
	 */
	@Override
	public double speedFactor() {
		return getEnginePower() * 0.001;
	}

	/**
	 * Opens the bed of the car transporter
	 */
	public void openBed() {

		if(!this.isMoving()) {
			this.bed.open();
		}


	}

	/**
	 * Closes the bed of the car transporter
	 */
	public void closeBed() {

		if(!this.isMoving()) {
			this.bed.close();
		}

	}

}