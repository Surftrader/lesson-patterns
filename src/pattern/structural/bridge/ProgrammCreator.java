package pattern.structural.bridge;

/**
 * Created by johndoe on 28.08.17.
 */
public class ProgrammCreator {
    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };

        for (Program program : programs) {
            program.developProgram();
        }
    }
}
