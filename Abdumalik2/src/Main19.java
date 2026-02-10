import java.util.ArrayDeque;

public class Main19 {
    public static void main(String[] args) {

        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.add(1);
        d.add(2);

        d.clear();

        System.out.println(d.peek());      // null
        System.out.println(d.isEmpty());   // true
    }
}
