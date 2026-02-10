import java.util.ArrayDeque;

public class Main11 {
    public static void main(String[] args) {

        ArrayDeque<Integer> q = new ArrayDeque<>();

        q.offer(1);
        q.offer(2);
        q.offer(3);

        System.out.println("Peek: " + q.peek());

        while (!q.isEmpty()) {
            System.out.println("Poll: " + q.poll());
        }
    }
}
