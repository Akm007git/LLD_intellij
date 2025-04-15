import Navigation.Navigator;
import Strategy.*;
public class Main {
    public static void main(String[] args) {
        Walking walking = new Walking(); // creating an object of the class Cycling

        // Cycling cycling = new Cycling(); // creating an object of the class Walking

        Navigator nv = new Navigator(walking);
        // creating an object of the class Navigator and passing the object of the class
        // Driving to it

        nv.navigate("Bangalore", "Kolkata");
    }
}
