package pattern.structural.decorator;

/**
 * Created by johndoe on 28.08.17.
 */
public class JavaTeamLead extends DeveloperDecorator {

    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekRoport() {
        return " Send week report to customer.";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekRoport();
    }
}
