package boats;

import abstracts.Boat;
import abstracts.Car;
import interfaces.CarLoader;

public class CarFerry extends Boat{

	private CarLoader loader;
	protected int cargoWeight = 0;
	
	public CarFerry() {

		super(0, 0);
		loader = new CarLoader(12, 10000);

	}

	public void load(Car newCargo) {

		loader.load(newCargo);
		cargoWeight += newCargo.getWeight();


	}

	public Car unLoad() {

		cargoWeight -= loader.getLoadWeight(0);
		
		return loader.unLoad(true);		

	}

}
