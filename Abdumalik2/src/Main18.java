import java.util.ArrayDeque;

public class Main18 {
    public static void main(String[] args) {

        ArrayDeque<Integer> d = new ArrayDeque<>();

        d.add(1);
        System.out.println(d.size() + " " + d.isEmpty());

        d.remove();
        System.out.println(d.size() + " " + d.isEmpty());
    }
}
