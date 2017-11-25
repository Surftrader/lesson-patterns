package pattern.behavioral.chair;

/**
 * Created by johndoe on 29.08.17.
 */
public class EmailNotifier extends Notifier {


    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending email: " + message);
    }
}
