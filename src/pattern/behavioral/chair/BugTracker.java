package pattern.behavioral.chair;

/**
 * Created by johndoe on 29.08.17.
 */
public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Everything is OK. ", Priority.ROUTINE);
        emailNotifier.notifyManager("Something went wrong. ", Priority.IMPORTANT);
        smsNotifier.notifyManager("Huston, we`ve had a problem here!!!  ", Priority.ASAP);
    }
}
