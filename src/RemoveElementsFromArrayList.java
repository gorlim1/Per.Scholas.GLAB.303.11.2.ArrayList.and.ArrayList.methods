import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayList {

    public static void main(String[] args) {

        List<String> programmingLanguages = new ArrayList<>();

        programmingLanguages.add("Java");
        programmingLanguages.add("C++");
        programmingLanguages.add("Python");
        programmingLanguages.add("JavaScript");
        programmingLanguages.add("C#");
        programmingLanguages.add("Ruby");
        programmingLanguages.add("PHP");

        System.out.println("Initial list: " + programmingLanguages);


        programmingLanguages.remove(5);
        System.out.println("After remove(5): " + programmingLanguages);


        boolean isRemoved = programmingLanguages.remove("JavaScript");
        System.out.println("isRemoved: " + isRemoved);
        System.out.println("After remove(\"JavaScript\"): " + programmingLanguages);


        List<String> scriptingLanguages = new ArrayList<>();

        scriptingLanguages.add("C++");
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        System.out.println("scriptingLanguages: " + scriptingLanguages);

        programmingLanguages.removeAll(scriptingLanguages); //only removes things in both from the first
        //scriptingLanguages.removeAll(scriptingLanguages); same as .clear


        System.out.println("After removeAll(scriptingLanguages): " + programmingLanguages);


        programmingLanguages.clear();
        System.out.println("After clear(): " + programmingLanguages);
    }
}