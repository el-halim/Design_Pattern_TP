package observers;

import observable.Observable;

public interface Observer {

    public void update(Observable observable);
}
