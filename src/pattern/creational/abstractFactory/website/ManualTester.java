package pattern.creational.abstractFactory.website;

import pattern.creational.abstractFactory.Tester;

/**
 * Created by johndoe on 27.08.17.
 */
public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website...");
    }
}
