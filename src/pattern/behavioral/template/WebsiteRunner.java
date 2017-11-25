package pattern.behavioral.template;

/**
 * Created by johndoe on 31.08.17.
 */
public class WebsiteRunner {
    public static void main(String[] args) {
        WebsiteTemplate welcomePage = new WelcomePage();
        WebsiteTemplate newsPage = new NewsPage();

        welcomePage.showPage();

        System.out.println("\n===========================\n");

        newsPage.showPage();
    }
}
