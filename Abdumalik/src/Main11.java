import java.util.ArrayList;
import java.util.List;

public class Main11 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>(List.of("USA", "UK", "France"));
        ArrayList<String> b = new ArrayList<>(List.of("France", "Germany"));

        a.retainAll(b);
        System.out.println(a);
    }
}
