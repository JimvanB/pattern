package app.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by Jim on 17-11-2016.
 */
@Component
public class Starter {

    @Autowired
    Changer changer;

    @PostConstruct
    private void start(){
        Thread thread = new Thread(changer);
        thread.start();
    }
}
