public class PriorityInteger implements Comparable<PriorityInteger> {

    private int value;
    private int priority;

    public PriorityInteger(int value, int priority) {
        this.value = value;
        this.priority = priority;
    }

    @Override
    public int compareTo(PriorityInteger o) {
        return this.priority - o.priority;
    }

    @Override
    public String toString() {
        return "Value: " + this.value + " Priority: " +this.priority;
    }
}
