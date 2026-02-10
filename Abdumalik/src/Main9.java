import java.util.ArrayList;
import java.util.List;

public class Main9 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(List.of("Paris", "London"));

        String[] array = cities.toArray(new String[0]);
        System.out.println(array.length);
    }
}
