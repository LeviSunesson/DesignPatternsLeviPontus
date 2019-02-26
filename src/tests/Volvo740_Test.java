package tests;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import abstracts.Car;
import carModels.Volvo740;
import javafx.scene.paint.Color;

public class Volvo740_Test {

	Car volvo = new Volvo740();

	@Test
	public void genericTest() {
		
		assertEquals(1400, volvo.getWeight(), 0);
		assertEquals(Color.RED, volvo.getColor());
		assertEquals("Volvo740", volvo.getModel());
		
		volvo.addWeight(1);
		assertEquals(1401, volvo.getWeight(), 0);
		
		volvo.removeWeight(1);
		assertEquals(1400, volvo.getWeight(), 0);
		
	}	
	
	
	@Test
	public void startCarTest() {
		
		volvo.move();
		assertEquals(0, volvo.getPos()[0], 0);
		
		volvo.startEngine();
		
		volvo.gas(1);
		volvo.move();
		assertEquals(1.35, volvo.getPos()[0], 0);
		assertEquals(0, volvo.getPos()[1], 0);
		
		volvo.turnLeft();
		volvo.move();
		
		assertEquals(1.35, volvo.getPos()[0], 0);
		assertEquals(-1.35, volvo.getPos()[1], 0);
		
		volvo.turnRight();
		volvo.move();
		
		assertEquals(1.35 * 2, volvo.getPos()[0], 0);
		assertEquals(0, volvo.getPos()[1], 0);
		
		
		
	}
	
}
