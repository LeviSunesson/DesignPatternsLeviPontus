package boats;

import abstracts.Boat;
import abstracts.Car;
import interfaces.Tow;

public class CarFerry extends Boat implements Tow{

	
	
	public CarFerry() {
		
		super(0, 0);
		
	}

	@Override
	public void carry(Car load) {
		// TODO Auto-generated method stub
		
	}

}
