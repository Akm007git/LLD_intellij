package Observers;

public class Laptop  implements Observer{

    private String name;
    public Laptop(String name)
    {
        this.name = name;
    }

    @Override
    public void update(float temparature) {
        System.out.println("In the laptop we are getting the temparature of " + name + " is " + temparature + "");
    }
}
