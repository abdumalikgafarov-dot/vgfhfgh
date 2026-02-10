import java.util.ArrayDeque;

public class Main16 {
    public static void main(String[] args) {

        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.add(1);
        d.add(2);
        d.add(3);

        System.out.println(d.poll());
        System.out.println(d.pollFirst());
        System.out.println(d.pollLast());
    }
}
