/**
 * Created by Jim on 15-11-2016.
 */
public class Main {


    public static void main(String[] args) {
        Zender zender = new Zender();
        Ontvanger1 ontvanger1 = new Ontvanger1();
        Ontvanger2 ontvanger2 = new Ontvanger2();

        System.out.println("update 1: ");
        zender.change("bericht1");

        zender.addObserver(ontvanger1);
        System.out.println("update 2:");
        zender.change("UPDATE 2");

        zender.addObserver(ontvanger2);
        System.out.println("update 3");
        zender.change("UPDATE 3");

        zender.deleteObserver(ontvanger2);
        System.out.println("update 4");
        zender.change("UPDATE4");

        zender.deleteObservers();
        zender.addObserver(ontvanger2);
        System.out.println("LAATSTE UPDATE".toLowerCase());

        zender.change("LAATSTE UPDAET");




    }


}
