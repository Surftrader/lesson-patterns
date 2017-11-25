package pattern.behavioral.command;

/**
 * Created by johndoe on 30.08.17.
 */
public class Database {
    public void insert(){
        System.out.println("Inserting record...");
    }

    public void update(){
        System.out.println("Updating record...");
    }

    public void select(){
        System.out.println("Selecting record...");
    }

    public void delete(){
        System.out.println("Deleting record...");
    }
}
