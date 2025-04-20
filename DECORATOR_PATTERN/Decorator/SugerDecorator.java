package Decorator;

import Coffee_shop.Coffee;

public class SugerDecorator extends CoffeeDecorator {
    public SugerDecorator(Coffee coffeeObj) {
        super(coffeeObj); // we are passing the object of the class Coffee to the constructor of the class CoffeeDecorator
    }

    @Override
    public String getDescription() {
        return coffeeObj.getDescription() + ", Suger"; // as we are adding suger to the coffee we are adding suger to the description of the coffee
    }


    @Override
    public double cost() {
        return coffeeObj.cost() + 7.0;
    }
}
