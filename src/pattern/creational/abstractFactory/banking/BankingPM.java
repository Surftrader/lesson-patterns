package pattern.creational.abstractFactory.banking;

import pattern.creational.abstractFactory.ProjectManager;

/**
 * Created by johndoe on 27.08.17.
 */
public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
