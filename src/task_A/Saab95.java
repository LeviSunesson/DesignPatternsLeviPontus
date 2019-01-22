package task_A;

import javafx.scene.paint.Color;

public class Saab95 extends Car {

	public boolean turboOn;

	public Saab95() {
		
		super("Saab95", 125, Color.BLACK);		
		turboOn = false;
		
	}

	private void setTurboOn() {
		turboOn = true;
	}

	private void setTurboOff() {
		turboOn = false;
	}

	@Override
	public double speedFactor() {
		double turbo = 1;
		if (turboOn)
			turbo = 1.3;
		return getEnginePower() * 0.01 * turbo;
	}

}