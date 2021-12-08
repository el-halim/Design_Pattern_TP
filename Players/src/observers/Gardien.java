package observers;

import observable.Observable;

public class Gardien implements  Observer{
    private double lastState;

    @Override

    public void update(Observable observable) {
        System.out.println("Gardien is notified ");

    }
}
