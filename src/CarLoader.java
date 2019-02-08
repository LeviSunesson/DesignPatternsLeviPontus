import java.util.ArrayList;

import abstracts.Car;

public class CarLoader {

	private ArrayList<Car> cargo = new ArrayList<Car>();
	private int cargoCapacity;

	public void load(Car newCargo) {

		if(!(cargo.size()-1 < cargoCapacity && newCargo.getWeight() > 3000)) {

			cargo.add(newCargo);

		}else {

			System.err.println("Couldn't load cargo : Cargobay full");

		}

	}

}
