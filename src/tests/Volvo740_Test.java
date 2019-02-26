package tests;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import abstracts.Car;
import carModels.Volvo740;

public class Volvo740_Test {

	Car volvo = new Volvo740();

	@Test
	public void startCarTest() {
		
		volvo.move();
		assertEquals(0, volvo.getPos()[0], 0);
		
		
	}
	
}
