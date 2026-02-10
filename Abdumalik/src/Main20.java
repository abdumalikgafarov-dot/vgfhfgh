import java.util.ArrayList;
import java.util.List;

public class Main20 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> list = new ArrayList<>();

        list.add(new ArrayList<>(List.of("Ali", "John")));
        list.add(new ArrayList<>(List.of("Sara")));

        System.out.println(list);
    }
}
