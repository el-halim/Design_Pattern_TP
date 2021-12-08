package observers;

import observable.Observable;

public class Couloir implements  Observer{
    private double lastState;

    @Override

    public void update(Observable observable) {

        System.out.println("Couloir is notified ");



    }
}
