package Navigation;
import Strategy.Strategy;

public class Navigator {
    private Strategy strategy;

    // Constructor to set the strategy
    public Navigator(Strategy strategy) {
        this.strategy = strategy; // comes the object
    }

    // Method to set the strategy at runtime
    public void setNavigator(Strategy strategy) {
        this.strategy = strategy;
    }

    // Method to build the route using the selected strategy
    public void navigate(String start, String end) {
        if (strategy != null) {
            strategy.buildRoute(start, end); // calling the method from the interface
        } else {
            System.out.println("No navigation strategy set.");
        }
    }
}
