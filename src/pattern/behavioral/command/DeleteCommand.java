package pattern.behavioral.command;

/**
 * Created by johndoe on 30.08.17.
 */
public class DeleteCommand implements Command {
    Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}
