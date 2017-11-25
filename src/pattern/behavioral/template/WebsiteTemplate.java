package pattern.behavioral.template;

/**
 * Created by johndoe on 31.08.17.
 */
public abstract class WebsiteTemplate {
    public void showPage() {
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    public abstract void showPageContent();
}
