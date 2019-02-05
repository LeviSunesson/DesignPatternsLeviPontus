package truckModels;

public class Flatbed {

	//private boolean isDown = true;
	private double angle = 0;
	//If the angle is 0 then the flatbed is down, else it is up
	
	public Flatbed() {
		
		
		
	}
	
	public boolean isDown() {
		
		return (angle == 0) ? true : false;
		
	}
	
	public void higher(int amount) {
		
		if(amount > 90-angle) {
			
			amount = (int) (90-angle);
			
		}else if(amount < 0) {
			
			amount = 0;
			
		}else if(angle == 90) {
			
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
	
}
