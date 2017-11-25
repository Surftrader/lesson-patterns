package pattern.behavioral.chair;

/**
 * Created by johndoe on 29.08.17.
 */
public class SMSNotifier extends Notifier {

    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending SMS to manager: " + message);
    }
}
