package pattern.behavioral.observer;

import java.util.List;

/**
 * Created by johndoe on 30.08.17.
 */
public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + name + "\nwe have some changes in vacancies:\n"
        + vacancies + "\n==================================================\n");
    }
}
