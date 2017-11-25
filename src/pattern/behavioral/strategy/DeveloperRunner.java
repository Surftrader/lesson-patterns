package pattern.behavioral.strategy;

/**
 * Created by johndoe on 31.08.17.
 */
public class DeveloperRunner {
    public static void main(String[] args) {

        Developer developer = new Developer();

        developer.setActivity(new Sleeping());
        developer.executeActivity();

        developer.setActivity(new Traininig());
        developer.executeActivity();

        developer.setActivity(new Coding());
        developer.executeActivity();

        developer.setActivity(new Reading());
        developer.executeActivity();

        developer.setActivity(new Sleeping());
        developer.executeActivity();
    }
}
