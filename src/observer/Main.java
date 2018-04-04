package observer;

public class Main {
	public static void main(String[] args) {
		Observable weatherStation = new WeatherStation();
		Observer cliDisplay = new CliDisplay(weatherStation);
		Observer webDisplay = new WebDisplay(weatherStation);
		
		weatherStation.notifyObservers();
	}
}
