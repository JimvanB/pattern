package app.component;

import app.domain.Zender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Jim on 17-11-2016.
 */
@Component
public class Changer implements Runnable{

    @Autowired
    private Zender zender;

    public void startChanging() {
        while(true) {
            double random1 = ThreadLocalRandom.current().nextInt(0, 1 + 1);
            double random2 = ThreadLocalRandom.current().nextInt(0, 8 + 1);
            double random3 = ThreadLocalRandom.current().nextInt(-50000, 50000 + 1);
            zender.newInput(random1, random2, random3);
            sleep();
        }
    }

    private void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public Zender getZender() {
        return zender;
    }

    @Override
    public void run() {
        startChanging();
    }
}
