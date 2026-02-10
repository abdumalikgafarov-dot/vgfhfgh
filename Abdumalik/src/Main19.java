import java.util.ArrayList;
import java.util.List;

public class Main19 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(List.of("Apple", "Banana"));
        ArrayList<Integer> lengths = new ArrayList<>();

        for (String f : fruits) {
            lengths.add(f.length());
        }
        System.out.println(lengths);
    }
}
