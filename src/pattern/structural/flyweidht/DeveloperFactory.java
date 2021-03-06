package pattern.structural.flyweidht;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by johndoe on 28.08.17.
 */
public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpecialty (String specialty) {
        Developer developer = developers.get(specialty);

        if(developer == null) {
            switch (specialty) {
                case "java":
                    System.out.println("Hiring Java developer...");
                    developer = new JavaDeveloper();
                    break;
                case "c++":
                    System.out.println("Hiring C++ developer...");
                    developer = new CppDeveloper();
            }
            developers.put(specialty, developer);
        }
        return developer;
    }

}
