package observerTest;

public class View implements Observer{

	public Model model;
	private String text;

	@Override
	public void update() {

		text = model.getText();
		updateView();
		

	}
	
	public void updateView(){
	
		System.out.println(text);
		
	}
	
}
