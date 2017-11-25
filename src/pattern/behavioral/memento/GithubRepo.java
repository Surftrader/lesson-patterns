package pattern.behavioral.memento;

/**
 * Created by johndoe on 30.08.17.
 */
public class GithubRepo {
    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
