package Decorator;
import Coffee_shop.Coffee;

public class MilkDecorator extends CoffeeDecorator {
    // constructer
    public MilkDecorator(Coffee coffeeObj) {
        super(coffeeObj);
    }

    @Override
    public String getDescription() {
        return coffeeObj.getDescription() + ", Milk"; // as we are adding milk to the coffee we are adding milk to the description of the coffee
    }


    @Override
    public double cost() {
        return coffeeObj.cost() + 5.0;
    }
}
