package pattern.structural.bridge;

/**
 * Created by johndoe on 28.08.17.
 */
public abstract class Program {
    protected Developer developer;

    protected Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();

}
