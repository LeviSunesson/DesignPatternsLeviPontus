package tests;

import carModels.Tesla_ModelS;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class Tesla_Test {

	Tesla_ModelS tesla = new Tesla_ModelS();
	
	@Test
	public void TeslaCar_Test() {
		
		tesla.startEngine();
		
		assertEquals(false, tesla.ludicrousOn);
		
		tesla.setLudicrousOn();
		
		assertEquals(true, tesla.ludicrousOn);
		
		tesla.gas(1);
		tesla.move();
		
		assertEquals(700*0.01*1.07 , tesla.speedFactor(), 0);
	
		tesla.setLudicrousOff();
		
		assertEquals(700*0.01, tesla.speedFactor(), 0);
		
		assertEquals(10, tesla.getCurrentSpeed(), 0);
		assertEquals(10, tesla.getPos()[0], 0);
		assertEquals(0, tesla.getPos()[1], 0);
		
		tesla.setLudicrousOff();
	 
		tesla.gas(1);
		tesla.move();		
	}
	
}
