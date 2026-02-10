import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>(List.of("Book1", "Book2"));
        ArrayList<String> b = new ArrayList<>(List.of("Book2", "Book3"));

        HashSet<String> result = new HashSet<>();
        result.addAll(a);
        result.addAll(b);

        System.out.println(result);
    }
}
