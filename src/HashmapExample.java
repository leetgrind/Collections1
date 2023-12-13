import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashmapExample {

    public static void main(String[] args) {
        System.out.println(anagramEfficient("dusoy", "study"));
    }

    public static void hashmapExample() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 5);
        map.put("Bob", 3);
        map.put("Claire", 6);
        map.putIfAbsent("Alice", 10); // overwrite

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

    // {4, 6, 11, 3}
    // 10 (6 +4) -> yes
    // 5 -> no

    static boolean twoSum(int[] nums, int  target) {
        // target 10
        // {4, 6, 11, 3}
        // { 6, 4 , -1, 7}
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<nums.length; i++) {

            int complement = target - nums[i];

            if(map.containsKey(complement)) {
                System.out.println("Index: " + map.get(complement) + " Index2: " + i);
                return true;
            }

            map.put(nums[i], i);
        }

        return false;
    }

    /*
    Given two strings s and t, return true if t is an anagram of s,
     and false otherwise.

    An Anagram is a word or phrase formed by rearranging
    the letters of a different word or phrase,
    typically using all the original letters exactly once.
    Example "study" ,"dusty" should return true
     */


    static boolean anagram(String s1, String s2) {

        if(s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s1.length(); i++) {
            Character currentChar = s1.charAt(i);
            if(map.containsKey(currentChar)) {
                map.put(currentChar, map.get(currentChar) +1);
            }
            else {
                map.put(currentChar, 1);
            }

        }

        // s-> 3, t> 2, o->1

        for (int i=0; i<s2.length(); i++) {
            Character currentChar = s1.charAt(i);

            if(map.containsKey(currentChar)) {
                map.put(currentChar, map.get(currentChar) -1);
            }
            else {
                return false;
            }

        }


        for(Character key: map.keySet()) {
            if(map.get(key) !=0) {
                return false;
            }
        }

        return true;
    }

    static boolean anagramEfficient(String s1, String s2) {

        if(s1.length()!=s2.length()) {
            return false;
        }

        int[] map = new int[26];

        for(int i=0; i<s1.length(); i++) {
            map[s1.charAt(i) - 'a']++;
            map[s2.charAt(i) -'a']--;
        }

        for(int n : map) {
            if(n!=0) {
                return false;
            }
        }

        return true;
    }









}
