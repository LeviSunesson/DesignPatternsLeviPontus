package observerTest;

import java.util.ArrayList;

public abstract class Observable {

	public ArrayList<Observer> observers = new ArrayList<Observer>();

	public void addObserver(Observer newOb) {
		
		this.observers.add(newOb);
		
	}
	
	public void removeObserver(Observer remOb) {
		
		this.observers.remove(remOb);
		
	}
	
	public void notifyObservers() {
		
		for(Observer o : observers) {
			
			o.update();
			
		}
		
	}
	
}
