package pattern.structural.proxy;

/**
 * Created by johndoe on 29.08.17.
 */
public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new RealProject("http://www.github.com/proselytear/realProject");

        project.run();

    }
}
