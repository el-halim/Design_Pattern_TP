package observable;

import observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Player implements Observable{

    private int score;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
            observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
           for (Observer o:observers)
           {

               o.update(this);
           }
    }




    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
        this.notifyObservers();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }
}
