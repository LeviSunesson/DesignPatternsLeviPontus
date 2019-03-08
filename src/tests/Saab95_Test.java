package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import carModels.Saab95;

public class Saab95_Test {

	Saab95 saab = new Saab95();

	@Test
	public void Saab_95_Test() {

		saab.startEngine();

		saab.setTurboOff();
		assertEquals(false, saab.turboOn);
		
		saab.setTurboOn();
		assertEquals(true, saab.turboOn);
		
		assertEquals(125*0.01*1.3 , saab.speedFactor(), 0);
		
		saab.setTurboOff();
		
		assertEquals(125*0.01, saab.speedFactor(), 0);


	}

}
