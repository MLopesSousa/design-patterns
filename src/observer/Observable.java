package observer;

public interface Observable {
	public void notifyObservers();
	public void addObserver(Observer observer);
	public int getTemperature();
}
