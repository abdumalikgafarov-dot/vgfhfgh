import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(List.of("Apple", "Banana", "Orange"));

        fruits.removeIf(f -> f.equals("Banana"));
        System.out.println(fruits);
    }
}
