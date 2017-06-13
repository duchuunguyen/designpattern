package learning.edu.designpattern.chapter02;

import java.text.MessageFormat;
import java.util.*;

/**
 * Created by duchuunguyen on 5/19/17.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    float temp;
    float humidity;
    Observable observable;

    public CurrentConditionDisplay(Observable weatherData) {
        this.observable = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println(MessageFormat.format("Current conditions: {0} F degrees and {1,number,#.##}% humidity", temp, humidity));
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
