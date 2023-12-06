import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        stringQueue();
    }

    public static void queue() {
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(23);
        priorityQueue.offer(14);
        priorityQueue.offer(99);

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }

    public static void stringQueue() {

        Queue<String> queue = new PriorityQueue<>((s1, s2) -> s1.length() - s2.length());

        queue.add("Alice");
        queue.add("Ciara453");
        queue.add("Bob");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }

}
