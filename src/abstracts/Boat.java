package abstracts;

import interfaces.Movable;

public abstract class Boat implements Movable {

	private double[] position = {0, 0};
	private double currentSpeed;
	private int angle = 0; // The angle (direction) of the car, 0 through 3.
	private boolean inWater = true;
	
	public Boat(double startX, double startY) {
		
		position[0] = startX;
		position[1] = startY;
		
	}

	/**
	 * Moves the car depending on the angle and currentSpeed.
	 */
	public void move() {

		double change = currentSpeed;

		if (!inWater) {
			currentSpeed *= 0.001;
		}
		
		change = (angle < 2) ? currentSpeed * -1 : currentSpeed;

		if(angle%2 == 0) {
			position[0] += change;
		}else {
			position[1] += change;
		}

	}

	/**
	 * Decrements the angle one step
	 */
	public void turnLeft() {

		angle--;	

		angle = (angle == -1) ? 3 : angle;
		// true ( left ) : false ( right )
	}

	/**
	 * Increments the angle one step
	 */
	public void turnRight() {

		angle++;

		angle = (angle == 4) ? 0 : angle;

	}
	
}
