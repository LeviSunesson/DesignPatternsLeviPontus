package interfaces;
import java.util.ArrayList;

import abstracts.Car;

public class CarLoader {

	private ArrayList<Car> cargo = new ArrayList<Car>(); // A list of all cars in the loader
	private int cargoCapacity; // The number of cars that can be on the loader
	private int weightCapacity; // The max weight of each car

	/**
	 * Creates a car loader. A object for storing cars
	 * @param capacity The number of cars that can be fit in to the car loader
	 * @param weightCapacity The max weight for each car
	 */
	public CarLoader(int capacity, int weightCapacity) {

		cargoCapacity = capacity;
		this.weightCapacity = weightCapacity;

	}

	/**
	 * Loads a car on to the car loader, adds it to the list
	 * @param newCargo The new car to be loaded
	 */
	public void load(Car newCargo) {

		if(!(cargo.size()-1 < cargoCapacity && newCargo.getWeight() > weightCapacity)) {

			cargo.add(newCargo);

		}else {

			System.err.println("Couldn't load cargo : Cargobay full");

		}

	}

	/**
	 * Unloads a car from the loader
	 * @param first If you want to unload the first car or the last car
	 * @return The car that is being unloaded
	 */
	public Car unLoad(boolean first) {

		if(cargo.size()  != 0) {

			return (first) ? cargo.get(0) : cargo.get(cargo.size()-1);

		}

		return null;

	}

	/**
	 * Gets the weight of any car on the loader
	 * @param index The index of the car you want to look at ( if the index is negative you get the last car)
	 * @return Return the weight of the car you want to look at.
	 */
	public int getLoadWeight(int index) {

		if(index < 0) {
		
			index = cargo.size()-1;
			
		}
		
		if(index > cargo.size()-1) {
			index = cargo.size()-1;
		}
		
		return cargo.get(index).getWeight();

	}

}
