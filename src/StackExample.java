import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.add(10);

        if(!stack.isEmpty()) {
            Integer result =  stack.peek();
            System.out.println(result);

            result = stack.pop();
            System.out.println(result);
        }




    }
}
