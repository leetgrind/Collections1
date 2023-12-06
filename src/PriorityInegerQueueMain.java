import javax.swing.text.Element;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityInegerQueueMain {

    public static void main(String[] args) {
        Queue<PriorityInteger> queue = new PriorityQueue<>();

        queue.add(new PriorityInteger(10, 1));
        queue.add(new PriorityInteger(91, 2));
        queue.add(new PriorityInteger(1, 3));

        System.out.println(queue);
    }
}
