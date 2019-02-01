package lab_1;

import javafx.scene.paint.Color;

public class LotusElise extends Car{

	public LotusElise() {
	
		super("Lotus Elise", 450, Color.RED);
	
	}

	@Override
	public double speedFactor() {
		return getEnginePower() * 0.01;
	}

}
