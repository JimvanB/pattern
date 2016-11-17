package app.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Jim on 15-11-2016.
 */
@Component
public class Zender extends Observable {

    List<Observer> observers = new ArrayList<Observer>();
    long counter;

    public void change(double bericht) {
        setChanged();
        notifyObservers(bericht);
    }

    public void newInput(double random1, double random2, double random3) {

        if ((random1 % 2) == 0) {
            Observer observer = new Ontvanger(random2, ++counter);
            addObserver(observer);
            observers.add(observer);
            change(random3);
        } else {
            if (observers.size() != 0) {
                int index = ThreadLocalRandom.current().nextInt(0, observers.size());
                deleteObserver(observers.get(index));
                observers.remove(index);
            }
        }
    }

    public List<Observer> getObservers() {
        return observers;
    }
}
