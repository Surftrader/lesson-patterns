package pattern.behavioral.visitor;

/**
 * Created by johndoe on 31.08.17.
 */
public class JuniorDeveloper implements Developer {
    @Override
    public void create(ProjectElement projectElement) {
        System.out.println("Writing poor class...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Drop database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating not reliable test...");
    }
}
