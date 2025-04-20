package ObservableObject;
import Observers.Observer;
import java.util.*;


public class WeatherApp implements Ovservable {
    ArrayList<Observer> observerList = new ArrayList<>(); // crating an arraylist to store the observers
    private float temparature; // creaing a float variable to store the temperature


    @Override
    public void addObserver(Observer obj) {
        observerList.add(obj);
    }

    @Override
    public void removeObserver(Observer obj) {
        observerList.remove(obj);
    }

    @Override
    public void notifyObserver() {
        for (Observer obj : observerList) {

            System.out.println(obj.getClass().getName());
            obj.update(temparature);
        }
    }

    // setter and getter methods for the private variable

    public void setTemparature(float temparature) {
        System.out.println("\n🌡️ WeatherStation: New temperature set to " + temparature + "°C");
        this.temparature = temparature;
        notifyObserver(); // calling the notifyObserver method to notify the observers about the change
    }

    public float getTemparature() {
        return temparature;
    }
}