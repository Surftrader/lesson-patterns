package pattern.behavioral.command;

/**
 * Created by johndoe on 30.08.17.
 */
public class UpdateCommand implements Command {
    Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}
