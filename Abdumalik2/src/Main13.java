import java.util.ArrayDeque;

public class Main13 {
    public static void main(String[] args) {

        ArrayDeque<Integer> d = new ArrayDeque<>();

        d.addFirst(2);
        d.addFirst(1);
        d.addLast(3);
        d.addLast(4);

        for (int x : d) {
            System.out.print(x + " ");
        }
    }
}
