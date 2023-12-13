import java.util.HashMap;
import java.util.Map;

public class CharFrequency {

    public static void main(String[] args) {
        String str = "aaaaaabbbccccddddd";
        int max = 0;
        char maxChar = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (Character currentChar : str.toCharArray()) {

            map.put(currentChar, map.getOrDefault(currentChar, 0)+1);

            if(max < map.get(currentChar)) {
                max = map.get(currentChar);
                maxChar = currentChar;
            }

        }

        System.out.println("Character: " + maxChar + " Value " + max);
    }

}
