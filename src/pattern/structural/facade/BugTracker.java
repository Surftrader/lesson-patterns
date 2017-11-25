package pattern.structural.facade;

/**
 * Created by johndoe on 28.08.17.
 */
public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint() {
        System.out.println("Sprint is active.");
        activeSprint = true;
    }

    public void finfshSprint() {
        System.out.println("Sprint is not active.");
        activeSprint = false;
    }
}
