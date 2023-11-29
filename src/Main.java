import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        arrayInteger();
    }

    public static void arrayList() {

        List<String> stringList = new ArrayList<>();

        stringList.add("ABC");
        stringList.add("DEF");

        if(stringList.isEmpty()) {
            System.out.println("String list is empty");
        }
        else {
            System.out.println("Size of the list is " + stringList.size());
        }

        for(int i=0; i<stringList.size(); i++) {
            System.out.println("Element at index: " + i + " " +stringList.get(i));
        }

        for(String element: stringList) {
            System.out.println(element);
        }
    }

    public static void arrayInteger() {

        List<Integer> numList = new ArrayList<>();
        Random random = new Random();

        for(int i=0; i<10; i++) {
            numList.add(random.nextInt(30));
        }

        numList.sort(Comparator.naturalOrder());

        //numList.sort(Comparator.reverseOrder());

        for (var num : numList) {
            System.out.println(num);
        }

    }
}