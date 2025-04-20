import ObservableObject.WeatherApp;
import Observers.Laptop;
import Observers.PhoneDisplay;
import Observers.TVdisplay;

public class Main {
    public static void main(String[] args) {

        System.out.println("main method is calling");

        // crate the object of the observable class
        WeatherApp wp = new WeatherApp();

        // crete the object of observer classes

        PhoneDisplay motorola =  new PhoneDisplay("Motorola");
        TVdisplay lg = new TVdisplay("LG");
        Laptop asus = new Laptop("Asusudu");

        // now we need to add te observers to the observer list
        wp.addObserver(motorola);
        wp.addObserver(lg);
        wp.addObserver(asus);

        wp.setTemparature(25.0f);



    }
}
