import java.util.ArrayList;
import java.util.List;

public class Main12 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(List.of("Alex", "Bob", "John"));
        names.removeIf(n -> n.length() % 2 == 0);
        System.out.println(names);
    }
}
