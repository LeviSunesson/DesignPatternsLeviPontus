package abstracts;

import interfaces.Movable;

public abstract class Boat implements Movable {

	private double[] position = {0, 0};
	private double currentSpeed;
	
	public Boat(double startX, double startY) {
		
		position[0] = startX;
		position[1] = startY;
		
	}

	public void move() {
		// TODO Auto-generated method stub
		
	}

	public void turnLeft() {
		// TODO Auto-generated method stub
		
	}

	public void turnRight() {
		// TODO Auto-generated method stub
		
	}
	
}
