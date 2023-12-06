import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        String str = "offer";

        Set<Character> set = new HashSet<>();


        for(Character c : str.toCharArray()) {
            set.add(c);
        }

        System.out.println(set);

    }

}
