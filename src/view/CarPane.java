package view;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class CarPane extends Pane {

	private ImageView volvoImage;
	private double xPos;
	private double yPos;
	private int cAngle;
	public double w;
	public double h;

	public CarPane() {
		
		Image img = new Image("/pics/Volvo740.png");
		
		volvoImage = new ImageView(img);
		this.getChildren().add(volvoImage);

		this.w = img.getWidth();
		this.h = img.getHeight();
	}

	public void move(double x, double y, int angle) {
		xPos = x;
		yPos = y;
		
		cAngle = angle;
		
	}

	public void update() {
		volvoImage.setX(xPos);
		volvoImage.setY(yPos);
		volvoImage.setRotate(cAngle * 90);
	}

}
