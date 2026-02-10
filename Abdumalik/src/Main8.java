import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main8 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>(List.of("Cat", "Dog", "Cat"));

        HashSet<String> result = new HashSet<>(animals);
        System.out.println(result);
    }
}
