package pattern.creational.methodFactory;

/**
 * Created by johndoe on 27.08.17.
 */
public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
