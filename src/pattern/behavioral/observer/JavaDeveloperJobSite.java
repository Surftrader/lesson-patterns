package pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by johndoe on 30.08.17.
 */
public class JavaDeveloperJobSite implements Observed{
    List<String> vacancies = new ArrayList<>();

    List<Observer> subscribers = new ArrayList<>();

    public void addVacancy (String vacancy) {
        this.vacancies.add(vacancy);
        notifyOvservers();
    }

    public void removeVacancy(String vacancy) {
        this.vacancies.remove(vacancy);
        notifyOvservers();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyOvservers() {
        for (Observer observer: subscribers) {
            observer.handleEvent(this.vacancies);
        }
    }
}
