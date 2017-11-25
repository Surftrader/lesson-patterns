package pattern.structural.bridge;

/**
 * Created by johndoe on 28.08.17.
 */
public class StockExchange  extends Program{
    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock Exchange development in progress...");
        developer.writeCode();
    }
}
