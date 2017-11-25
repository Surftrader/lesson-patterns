package pattern.creational.abstractFactory;

import pattern.creational.abstractFactory.banking.BankingTeamFactory;

/**
 * Created by johndoe on 27.08.17.
 */
public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank system...");

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();

    }
}
