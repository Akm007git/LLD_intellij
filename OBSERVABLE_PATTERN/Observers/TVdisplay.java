package Observers;

import ObservableObject.Ovservable;

public class TVdisplay implements Observer {

    private String name;

    public TVdisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(float temparature) {
        System.out.println("In the TV display we are getting the temparature of " + name + " is " + temparature + "");
    }
}
