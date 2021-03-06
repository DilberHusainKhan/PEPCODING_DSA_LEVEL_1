import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        stack.push(10);
        System.out.println(stack);
        System.out.println(stack.peek());

        stack.push(20);
        System.out.println(stack);
        System.out.println(stack.peek());

        stack.push(30);
        System.out.println(stack);
        System.out.println(stack.peek());

        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
    }
}
