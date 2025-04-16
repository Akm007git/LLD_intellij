package ObservableObject;
import Observers.Observer;

// there are basically 3 properties in the observable interfaces
public interface Ovservable {
    void addObserver(Observer obj);
    void removeObserver(Observer obj);
    void notifyObserver();


}
