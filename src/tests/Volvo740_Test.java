package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import carModels.Volvo740;
import javafx.scene.paint.Color;

public class Volvo740_Test {

	Volvo740 volvo = new Volvo740();

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
		assertEquals(-1.35, volvo.getPos()[1], 0);

		volvo.turnRight();
		volvo.turnRight();
		volvo.turnRight();
		volvo.turnRight();
		
		assertEquals(1.35 * 2, volvo.getPos()[0], 0);
		assertEquals(-1.35, volvo.getPos()[1], 0);

		volvo.turnLeft();
		volvo.turnLeft();
		volvo.turnLeft();
		volvo.turnLeft();
		
		assertEquals(1.35 * 2, volvo.getPos()[0], 0);
		assertEquals(-1.35, volvo.getPos()[1], 0);
		assertEquals(true, volvo.isMoving());
		
		volvo.gas(-1);
		volvo.gas(2);
		volvo.brake(2);
		volvo.brake(-1); 
		volvo.brake(1);
		volvo.brake(0.5);
	
		assertEquals(0, volvo.getCurrentSpeed(), 0);
		
		volvo.move();
		
		assertEquals(2.7, volvo.getPos()[0], 0);
		
		volvo.stopEngine();
		volvo.gas(1);
		
		assertEquals(0, volvo.getCurrentSpeed(), 0);
		assertEquals(false, volvo.isMoving());
		
		volvo.startEngine();
		for (int i = 0; i < 110; i++) {
			
			volvo.gas(1);
			
		}
		
		assertEquals(100, volvo.getCurrentSpeed(), 10);
		
	}
	
}
