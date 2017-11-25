package pattern.behavioral.state;

/**
 * Created by johndoe on 31.08.17.
 */
public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public  void changeActivity() {
        if (activity instanceof Sleeping) {
            setActivity(new Traininig());
        } else if (activity instanceof Traininig) {
            setActivity(new Coding());
        } else if (activity instanceof Coding) {
            setActivity(new Reading());
        } else if (activity instanceof Reading) {
            setActivity(new Sleeping());
        }
    }

    public void justDoIt() {
        activity.justDoIt();
    }
}
