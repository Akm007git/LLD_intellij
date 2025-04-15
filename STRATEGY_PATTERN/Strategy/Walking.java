package Strategy;

public class Walking implements Strategy {
    @Override
    public void buildRoute(String start, String end) {
        System.out.println("Walking from " + start + " to " + end);
    }
}

