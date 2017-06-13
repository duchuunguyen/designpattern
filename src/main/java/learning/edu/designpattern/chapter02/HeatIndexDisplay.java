package learning.edu.designpattern.chapter02;

import java.text.MessageFormat;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by duchuunguyen on 5/20/17.
 */
public class HeatIndexDisplay implements Observer, DisplayElement {
    private float heatIndex;
    private Observable observable;

    public HeatIndexDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    private float computeHeatIndex(float t, float rh) {
        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
                (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
                (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }

    @Override
    public void display() {
        System.out.println(MessageFormat.format("Heat index is [{0,number,#.##}]", heatIndex));
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            this.heatIndex = computeHeatIndex(weatherData.getTemperature(), weatherData.getHumidity());
            display();
        }
    }
}