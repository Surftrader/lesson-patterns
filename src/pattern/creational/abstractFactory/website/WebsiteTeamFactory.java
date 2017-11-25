package pattern.creational.abstractFactory.website;

import pattern.creational.abstractFactory.Developer;
import pattern.creational.abstractFactory.ProjectManager;
import pattern.creational.abstractFactory.ProjectTeamFactory;
import pattern.creational.abstractFactory.Tester;

/**
 * Created by johndoe on 27.08.17.
 */
public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
