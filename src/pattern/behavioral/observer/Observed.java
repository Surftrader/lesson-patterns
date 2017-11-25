package pattern.behavioral.observer;

/**
 * Created by johndoe on 30.08.17.
 */
public interface Observed {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyOvservers();
}
