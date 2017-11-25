package pattern.structural.facade;

/**
 * Created by johndoe on 28.08.17.
 */
public class Developer {
    public void doJobBeforeDeadLine(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            System.out.println("Developer is solving problem...");
        } else {
            System.out.println("Developer is reading habrahabr...");
        }
    }
}
