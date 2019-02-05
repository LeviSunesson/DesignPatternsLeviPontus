package truckModels;

import java.util.ArrayList;

import abstracts.Car;
import javafx.scene.paint.Color;

public class Flatbed {

	public Color color;
	private double angle = 0;
	private ArrayList<Car> cargo = new ArrayList<Car>();
	private int cargoCapacity;
	
	//If the angle is 0 then the flatbed is down, else it is up
	
	public Flatbed(Color color, int capacity) {
		
		this.color = color;
		cargoCapacity = capacity;
		
	}
	
	public void load(Car newCargo) {
		
		if(!(cargo.size()-1 < cargoCapacity)) {
			
			cargo.add(newCargo);
			
		}else {
			
			System.err.println("Couldn't load cargo : Cargobay full");
			
		}
		
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
