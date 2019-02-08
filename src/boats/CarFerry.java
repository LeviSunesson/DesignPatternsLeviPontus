package boats;

import abstracts.Boat;
import abstracts.Car;
import interfaces.CarLoader;

public class CarFerry extends Boat{

	private CarLoader loader; // The object for storing cars on the ferry
	protected int cargoWeight = 0; // The capacity of the ferry
	
	/**
	 * A car ferry for carrying cars across a body of water
	 */
	public CarFerry() {

		super(0, 0);
		loader = new CarLoader(12, 10000);

	}

	/**
	 * Loads a single car onto the ferry's car bay
	 * @param newCargo The car to load
	 */
	public void load(Car newCargo) {

		loader.load(newCargo);
		cargoWeight += newCargo.getWeight();


	}

	/**
	 * Unloads a car from the ferry's car bay
	 * @return The that is being unloaded
	 */
	public Car unLoad() {

		cargoWeight -= loader.getLoadWeight(0);
		
		return loader.unLoad(true);		

	}

}
