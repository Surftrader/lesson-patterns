package pattern.creational.abstractFactory;

/**
 * Created by johndoe on 27.08.17.
 */
public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
