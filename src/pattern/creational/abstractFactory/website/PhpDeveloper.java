package pattern.creational.abstractFactory.website;

import pattern.creational.abstractFactory.Developer;

/**
 * Created by johndoe on 27.08.17.
 */
public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
