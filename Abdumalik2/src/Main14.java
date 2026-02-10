import java.util.ArrayDeque;

public class Main14 {
    public static void main(String[] args) {

        ArrayDeque<Integer> d = new ArrayDeque<>();

        System.out.println(d.offerFirst(10));
        System.out.println(d.offerLast(20));

        System.out.println(d);
    }
}
