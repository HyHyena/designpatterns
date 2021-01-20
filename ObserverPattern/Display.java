package ObserverPattern;

public class Display implements IObserver{
    WeatherStation weatherStation;
    String name;

    public Display(WeatherStation weatherStation, String name) {
        this.weatherStation = weatherStation;
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Updating value " + this.name);
        System.out.println("My new value = " + weatherStation.getTemperature());
        System.out.println("Value has been updated");

    }
}
