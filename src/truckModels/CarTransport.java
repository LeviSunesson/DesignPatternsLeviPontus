package truckModels;

import abstracts.Car;
import abstracts.Truck;
import interfaces.CarLoader;
import javafx.scene.paint.Color;


public class CarTransport extends Truck{

	private CarLoader loader;

	public CarTransport(String model, int enginePower, Color color) {

		super(model, enginePower, color, 7000, 4);
		loader = new CarLoader(4, 2500);

	}

	public void load(Car newCargo) {

		if(newCargo != this) {

			loader.load(newCargo);
			this.addWeight(newCargo.getWeight());

		}

	}

	public Car unLoad() {

		this.removeWeight(loader.getLoadWeight(-1));

		return loader.unLoad(false);

	}

	@Override
	public double speedFactor() {
		return getEnginePower() * 0.001;
	}

	public void openBed() {

		if(!this.isMoving()) {
			this.bed.open();
		}


	}

	public void closeBed() {

		if(!this.isMoving()) {
			this.bed.close();
		}

	}

}