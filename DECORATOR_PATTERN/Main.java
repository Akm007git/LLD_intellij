import Coffee_shop.Simplecoffee;
import Coffee_shop.Coffee;
import Decorator.MilkDecorator;
import Decorator.SugerDecorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffeeObj = new Simplecoffee();
        System.out.println(coffeeObj.getDescription());
        System.out.println(coffeeObj.cost());//15

        // now we are creating an object of the class Coffee and passing the object of the class SimpleCoffee to it
     Coffee coffeeObj2 = new MilkDecorator(new Simplecoffee());
     System.out.println(coffeeObj2.getDescription());
     System.out.println(coffeeObj2.cost()); //15

     // now we are creating an object of the class Coffee and passing the object of the class MilkDecorator to it
     Coffee coffeeObj3 = new SugerDecorator(new MilkDecorator(coffeeObj2));
     System.out.println(coffeeObj3.getDescription());
     System.out.println(coffeeObj3.cost());
    }
}
