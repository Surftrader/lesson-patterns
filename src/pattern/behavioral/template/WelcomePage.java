package pattern.behavioral.template;

/**
 * Created by johndoe on 31.08.17.
 */
public class WelcomePage extends WebsiteTemplate{

    @Override
    public void showPageContent() {
        System.out.println("Welcome");
    }
}
