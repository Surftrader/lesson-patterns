package pattern.behavioral.command;

/**
 * Created by johndoe on 30.08.17.
 */
public class SelectCommand implements Command {
    Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
