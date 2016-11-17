import java.util.Observable;

/**
 * Created by Jim on 15-11-2016.
 */
public class Zender extends Observable {


    public void change(String bericht){
        setChanged();
        notifyObservers(bericht);
    }


}
