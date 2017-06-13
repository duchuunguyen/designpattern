package learning.edu.designpattern.chapter02;
import java.text.MessageFormat;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by duchuunguyen on 5/20/17.
 */
public class ForcastDisplay implements Observer, DisplayElement{
    private Observable observable;
    private float currentPressure = 29.2f;
    private float lastPressure;
    public ForcastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.lastPressure = this.currentPressure;
            this.currentPressure = weatherData.getPressure();

            display();
        }
    }

    @Override
    public void display() {
        System.out.println(
                MessageFormat.format(
                        "Last pressure: [{0,number,#.##}], current pressure: [{1, number, #.##}]",
                        this.lastPressure, this.currentPressure));
    }
}
