package Decorator;
import Coffee_shop.Coffee;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffeeObj; // basically we are creating an refernce object of the coffee class and it is showing has - a reference to the object of the class Coffee


    // Now we have create the constructer of the class CoffeeDecorator, and we are passing the object of the class Coffee to it
    public CoffeeDecorator(Coffee coffeeObj) {
        this.coffeeObj = coffeeObj;
    }

    // now also we have to implement the abstract method of the class Coffee
    @Override
    public String getDescription() {
        return coffeeObj.getDescription();
    }

    @Override
    public double cost()
    {
        return this.coffeeObj.cost();
    }
}
