package observer;

public class CliDisplay implements Observer {

	private Observable observable;
	
	public CliDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}
	
	@Override
	public void run() {
		System.out.println("CliDisplay " + this.observable.getTemperature());
		
	}

}
