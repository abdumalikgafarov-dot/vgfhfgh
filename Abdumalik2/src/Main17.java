import java.util.ArrayDeque;

public class Main17 {
    public static void main(String[] args) {

        ArrayDeque<String> d = new ArrayDeque<>();
        d.add("a");
        d.add("b");
        d.add("c");
        d.add("b");
        d.add("a");

        d.removeFirstOccurrence("b");
        System.out.println(d);

        d.removeLastOccurrence("a");
        System.out.println(d);
    }
}
