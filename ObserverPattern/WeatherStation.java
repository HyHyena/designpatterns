package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable{
    List<IObserver> observers;
    int temperature;

    public WeatherStation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void add(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void Notify() {
        for(IObserver observer : observers){
            observer.update();
        }
    }

    public int getTemperature(){
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
