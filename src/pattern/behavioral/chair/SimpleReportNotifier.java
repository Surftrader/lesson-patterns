package pattern.behavioral.chair;

/**
 * Created by johndoe on 29.08.17.
 */
public class SimpleReportNotifier extends Notifier {


    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying using simple report: " + message);
    }
}
