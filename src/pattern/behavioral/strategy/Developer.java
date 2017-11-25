package pattern.behavioral.strategy;

/**
 * Created by johndoe on 31.08.17.
 */
public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity() {
        activity.justDoIt();
    }
}
