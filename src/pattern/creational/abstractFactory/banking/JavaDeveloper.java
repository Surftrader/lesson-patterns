package pattern.creational.abstractFactory.banking;

import pattern.creational.abstractFactory.Developer;

/**
 * Created by johndoe on 27.08.17.
 */
public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}
