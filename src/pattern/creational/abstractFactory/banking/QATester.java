package pattern.creational.abstractFactory.banking;

import pattern.creational.abstractFactory.Tester;

/**
 * Created by johndoe on 27.08.17.
 */
public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA tester tests banking code...");
    }
}
