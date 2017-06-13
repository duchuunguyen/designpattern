package learning.edu.designpattern.chapter02;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.stream.Collectors;

/**
 * Created by duchuunguyen on 5/18/2017.
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
