package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Display phoneDisplay = new Display(weatherStation, "phoneDisplay");
        Display someOtherDisplay = new Display(weatherStation, "someOtherDisplay");
        weatherStation.setTemperature(10);
        weatherStation.add(phoneDisplay);
        weatherStation.add(someOtherDisplay);
        weatherStation.Notify();
        weatherStation.remove(someOtherDisplay);
        weatherStation.setTemperature(20);
        weatherStation.Notify();
    }
}
