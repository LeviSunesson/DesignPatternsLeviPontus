package truckModels;

import java.util.ArrayList;

import abstracts.Car;

public class Flatbed {

	private double angle = 0;
	private ArrayList<Car> cargo = new ArrayList<Car>();
	private int cargoCapacity;
	
	//If the angle is 0 then the flatbed is down, else it is up
	
	public Flatbed(int capacity) {

		cargoCapacity = capacity;
		
	}
	
	public void load(Car newCargo) {
		
		if(!(cargo.size()-1 < cargoCapacity && newCargo.getWeight() < 3000)) {
			
			cargo.add(newCargo);
			
		}else {
			
			System.err.println("Couldn't load cargo : Cargobay full");
			
		}
		
	}
	
	public boolean isDown() {
		
		return (angle == 0) ? true : false;
		
	}
	
	public void higher(int amount) {
		
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
	
}
