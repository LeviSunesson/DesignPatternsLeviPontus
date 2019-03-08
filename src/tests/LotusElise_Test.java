package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import carModels.LotusElise;

public class LotusElise_Test {

	LotusElise car = new LotusElise();
	
	@Test
	public void Lotus_Test() {
		
		car.startEngine();
		
		assertEquals(450*0.01, car.speedFactor(), 0);
		
	}
	
}
