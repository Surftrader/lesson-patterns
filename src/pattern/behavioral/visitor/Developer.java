package pattern.behavioral.visitor;

/**
 * Created by johndoe on 31.08.17.
 */
public interface Developer {
    public void create(ProjectElement projectElement);

    public void create(Database database);

    public void create(Test test);
}
