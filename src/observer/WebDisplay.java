package observer;

public class WebDisplay implements Observer {

	private Observable observable;
	
	public WebDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}
	
	@Override
	public void run() {
		System.out.println("WebDisplay " + this.observable.getTemperature());
		
	}

}
