package app.domain;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Jim on 15-11-2016.
 */
public class Ontvanger implements Observer {

    double value;

    public Ontvanger(double value){
        this.value = value;
    }

    public void update(Observable o, Object arg) {
        value = value * - (Double) arg;
    }

    public String getValue() {
        return "My value is: " +value;
    }
}
