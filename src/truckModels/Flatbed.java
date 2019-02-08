package truckModels;

public class Flatbed {

	private double angle = 0;//If the angle is 0 then the flatbed is down, else it is up
	
	/**
	 * Creates a flatbed
	 */
	public Flatbed() {
	
	}
	
	/**
	 * Checks if the flat bed is in its downward position
	 * @return true if it is down
	 */
	public boolean isDown() {
		
		return (angle == 0) ? true : false;
		
	}
	
	/**
	 * Returns the angle of the bed
	 * @return the angle in degrees (double)
	 */
	public double getAngle() {
		
		return angle;
		
	}
	
	/**
	 * Raises the flatbed a set amount of degrees ( capped at 0 - 90 )
	 * @param amount The angle of which to raise the bed
	 */
	public void raise(int amount) {
		
		int restrictionAngle = 70;
		
		if(amount > restrictionAngle-angle) {
			
			amount = (int) (restrictionAngle-angle);
			
		}else if(amount < 0) {
			
			amount = 0;
			
		}else if(angle == restrictionAngle) {
			
			return;
			
		}
		
		angle += amount;
		
	}

	/**
	 * Lowers the flatbed a set amount of degrees ( capped at 0 - 90 )
	 * @param amount The angle of which to lower the bed
	 */
	public void lower(int amount) {
		
		if(amount > angle) {
			
			amount = (int) (angle);
			
		}else if(angle == 0) {
			
			return;
			
		}else if(amount < 0) {
			
			amount = 0;
			
		}
		
		angle -= amount;
		
	}
	
	/**
	 * Fully opens the flatbed
	 */
	public void open() {
		
		angle = 90;
		
	}
	
	/**
	 * Puts the flatbed down to 0 (closed)
	 */
	public void close() {
		
		angle = 0;
	}
	
}
