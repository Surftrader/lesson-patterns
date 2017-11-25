package pattern.behavioral.visitor;

/**
 * Created by johndoe on 31.08.17.
 */
public class Database implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
