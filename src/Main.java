import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        arrayList();
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
}