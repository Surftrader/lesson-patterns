package pattern.structural.adapter;

/**
 * Created by johndoe on 28.08.17.
 */
public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();

        database.insert();
        database.update();
        database.select();
        database.remove();

    }
}
