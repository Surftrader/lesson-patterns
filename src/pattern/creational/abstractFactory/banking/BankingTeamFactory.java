package pattern.creational.abstractFactory.banking;

import pattern.creational.abstractFactory.Developer;
import pattern.creational.abstractFactory.ProjectManager;
import pattern.creational.abstractFactory.ProjectTeamFactory;
import pattern.creational.abstractFactory.Tester;

/**
 * Created by johndoe on 27.08.17.
 */
public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
