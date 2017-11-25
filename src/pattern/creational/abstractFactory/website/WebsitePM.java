package pattern.creational.abstractFactory.website;

import pattern.creational.abstractFactory.ProjectManager;

/**
 * Created by johndoe on 27.08.17.
 */
public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
