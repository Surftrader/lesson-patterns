package pattern.behavioral.visitor;

/**
 * Created by johndoe on 31.08.17.
 */
public class SeniorDeveloper implements Developer{
    @Override
    public void create(ProjectElement projectElement) {
        System.out.println("Rewriting class ater junior...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Fixing database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating reliable test...");
    }
}
