package learning.edu.designpattern.chapter02;

/**
 * Created by duchuunguyen on 5/19/17.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);
        HeatIndexDisplay indexDisplay = new HeatIndexDisplay(weatherData);
        ForcastDisplay forcastDisplay = new ForcastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 50.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
