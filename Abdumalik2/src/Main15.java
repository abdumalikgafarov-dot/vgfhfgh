import java.util.ArrayDeque;

public class Main15 {
    public static void main(String[] args) {

        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.add(1);
        d.add(2);
        d.add(3);

        System.out.println(d.peek());
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());

        d.clear();

        System.out.println(d.peek());      // null
        System.out.println(d.peekFirst()); // null
        System.out.println(d.peekLast());  // null
    }
}
