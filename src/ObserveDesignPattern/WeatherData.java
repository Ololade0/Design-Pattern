package ObserveDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private final ArrayList<Observer> observers;

    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherData() {
             observers = new ArrayList<>();
    }


    @Override
    public void registerObserver() {

    }

    @Override
    public void removeObserver() {

    }

    @Override
    public void notifyObserver() {

    }

    public void getTemperature() {

    }


    public void getHumidity() {

    }

    public void getPressure() {

    }

    public void measuredChanged() {


    }





}
