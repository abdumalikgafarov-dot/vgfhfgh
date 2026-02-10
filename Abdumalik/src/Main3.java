import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<>(List.of("Pizza", "Burger", "Pizza"));

        int count = 0;
        for (String f : foods) {
            if (f.equals("Pizza")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
