import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStream {

    public static void main(String[] args) {


        List<String> names = Arrays.asList("Alice", "Bob", "Carrie", "Dave", "Ella");


        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .map(name -> name + " " + name.length())
                .collect(Collectors.toList());


        for (var name: upperCaseNames) {
            System.out.println(name);
        }

    }
}
