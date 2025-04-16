package Observers;
public class PhoneDisplay implements  Observer {

    private String name;
    public PhoneDisplay(String name)
    {
        this.name = name;
    }
    @Override
    public void update(float temparature)
    {
        System.out.println("In the phone display we are getting the temparature of " + name + " is " + temparature + "");
    }
}
