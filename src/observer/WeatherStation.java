package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {

	private List<Observer> observers = new ArrayList<>();

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.run();
		}
	}

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public int getTemperature() {
		// TODO Auto-generated method stub
		return 10;
	}

}
