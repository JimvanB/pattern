package app.domain;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Jim on 15-11-2016.
 */
public class Ontvanger implements Observer {

    long id;
    double value;

    public Ontvanger(double value, long id) {
        this.value = value;
        this.id = id;
    }

    public void update(Observable o, Object arg) {
        value = value * -(Double) arg;
    }

    public String getValue() {
        return "Observer id: " + id + " --> My value is: " + value;
    }
}
