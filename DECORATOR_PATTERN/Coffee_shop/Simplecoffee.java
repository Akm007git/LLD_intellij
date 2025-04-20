package Coffee_shop;

public class Simplecoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple coffee";
    }

    @Override
    public double cost() {
        return 10.0;
    }
}
