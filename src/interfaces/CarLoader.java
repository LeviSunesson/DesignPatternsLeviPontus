package interfaces;
import java.util.ArrayList;

import abstracts.Car;

public class CarLoader {

	private ArrayList<Car> cargo = new ArrayList<Car>();
	private int cargoCapacity;
	private int weightCapacity;

	public CarLoader(int capacity, int weightCapacity) {

		cargoCapacity = capacity;
		this.weightCapacity = weightCapacity;

	}

	public void load(Car newCargo) {

		if(!(cargo.size()-1 < cargoCapacity && newCargo.getWeight() > weightCapacity)) {

			cargo.add(newCargo);

		}else {

			System.err.println("Couldn't load cargo : Cargobay full");

		}

	}

	public Car unLoad(boolean first) {

		if(cargo.size()  != 0) {

			return (first) ? cargo.get(0) : cargo.get(cargo.size()-1);

		}

		return null;

	}

	public int getLoadWeight(int index) {

		if(index < 0) {
		
			index = cargo.size()-1;
			
		}
		return cargo.get(index).getWeight();

	}

}
