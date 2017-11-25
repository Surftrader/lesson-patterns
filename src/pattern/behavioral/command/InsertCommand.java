package pattern.behavioral.command;

/**
 * Created by johndoe on 30.08.17.
 */
public class InsertCommand implements Command {
    Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }


    @Override
    public void execute() {
        database.insert();
    }
}
