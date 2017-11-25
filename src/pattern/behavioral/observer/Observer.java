package pattern.behavioral.observer;

import java.util.List;

/**
 * Created by johndoe on 30.08.17.
 */
public interface Observer {
    public void handleEvent(List<String> vacancies);
}
