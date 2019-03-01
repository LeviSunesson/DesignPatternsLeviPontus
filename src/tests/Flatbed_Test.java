package tests;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import truckModels.Flatbed;
import truckModels.Scania;

public class Flatbed_Test {

	Scania scania = new Scania();
	Flatbed flatbed = new Flatbed();
	
	@Test
	public void startTruckTest() {
		
		scania.raise(10);
		scania.startEngine();
		assertEquals(false,scania.isMoving());
		scania.gas(1);
		scania.move();
		assertEquals(0, scania.getCurrentSpeed(),0);
		assertEquals(0, scania.getPos()[0],0);
		assertEquals(0, scania.getPos()[1],0);
		
		scania.lower(10);
		scania.startEngine();
		scania.gas(1);
		scania.move();
		assertEquals(0.01, scania.getCurrentSpeed(),0.01);
		assertEquals(0.01, scania.getPos()[0],0.01);
		assertEquals(0, scania.getPos()[1],0.01);
		
		flatbed.open();
		assertEquals(90, flatbed.getAngle(), 0);
		flatbed.close();
		assertEquals(0, flatbed.getAngle(), 0);
		
	}
	
}
