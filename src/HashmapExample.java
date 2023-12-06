import java.util.HashMap;
import java.util.Map;

public class HashmapExample {

    public static void main(String[] args) {

        hashmapExample();

    }

    public static void hashmapExample() {

        Map<String, Integer> map = new HashMap<>();

        map.put("Alice", 5);
        map.put("Bob", 3);
        map.put("Claire", 6);
        map.put("Alice", 10); // overwrite

        // "alice" --> 5
        // bob --> 3

        if(map.containsKey("Alice")) {
            int count = map.get("Alice");
            System.out.println(count);
        }
        else {
            System.out.println("Key doesn't exist");
        }



        for(String key : map.keySet()) {
            System.out.println("Key " + key + " Value: " + map.get(key));
        }


    }
}
