import java.util.ArrayDeque;

public class Main12 {
    public static void main(String[] args) {

        ArrayDeque<String> stack = new ArrayDeque<>();

        stack.push("One");
        stack.push("Two");
        stack.push("Three");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
