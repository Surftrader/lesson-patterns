package pattern.creational.prototype;

/**
 * Created by johndoe on 28.08.17.
 */
public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject", "SourceCode sourceCode = new SourceCode()");

        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();

        System.out.println("\n=====================\n");
        System.out.println(masterClone);




    }
}
