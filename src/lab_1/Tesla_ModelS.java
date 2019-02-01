package lab_1;

import javafx.scene.paint.Color;

public class Tesla_ModelS extends Car{
	
	public boolean ludicrousOn = false;
	
	public Tesla_ModelS(){
		
		super("Tesla Model S", 700, Color.DARKRED);
		ludicrousOn = false;
	}
	
	private void setLudicrousOn() {
		ludicrousOn = true;
	}
	
	private void setLudicrousOff() {
		ludicrousOn = false;
	}

	@Override
	public double speedFactor() {
		double boost = 1;
		if (ludicrousOn)
			boost = 1.07;
		return getEnginePower() * 0.01 * boost;
	}

	@Override
	public void startEngine() {
		
		this.currentSpeed = 1;
		
	}
	
}
