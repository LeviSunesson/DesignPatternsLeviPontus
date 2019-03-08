package tests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import boats.*;
import carModels.Volvo740;

public class CarFerry_Test {

	Volvo740 car = new Volvo740();
	CarFerry ferry = new CarFerry();
	
	@Test
	public void startBoatTest() {
		
		ferry.load(car);
		
		assertEquals(car, ferry.unLoad());
		
		assertEquals(null, ferry.unLoad());
		
		
	}
}
