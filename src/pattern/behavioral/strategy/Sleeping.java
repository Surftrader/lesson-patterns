package pattern.behavioral.strategy;

/**
 * Created by johndoe on 31.08.17.
 */
public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Sleeping...");
    }
}
