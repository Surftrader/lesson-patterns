package pattern.behavioral.iterator;

/**
 * Created by johndoe on 30.08.17.
 */
public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Maven", "PostreSQL"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Sergey Poddubka", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.println("Skills;");

        while(iterator.hasNext()) {
            System.out.print(iterator.next().toString() + " ");
        }

    }
}
