import java.util.Observable;
import java.util.Observer;

/**
 * Created by Jim on 15-11-2016.
 */
public class Ontvanger2 implements Observer {
    public void update(Observable o, Object arg) {
        System.out.println((String) arg + " van object 2");
    }
}
