package truckModels;

public class Flatbed {

	private double angle = 0;
	
	
	//If the angle is 0 then the flatbed is down, else it is up
	
	public Flatbed() {
	
	}
	
	public boolean isDown() {
		
		return (angle == 0) ? true : false;
		
	}
	
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
	
	public void open() {
		
		angle = 90;
		
	}
	
	public void close() {
		
		angle = 0;
	}
	
}
