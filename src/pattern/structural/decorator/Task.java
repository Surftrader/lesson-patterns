package pattern.structural.decorator;

/**
 * Created by johndoe on 28.08.17.
 */
public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLead( new SeniorJavaDeveloper( new JavaDeveloper()));

        System.out.println(developer.makeJob());
    }
}
