import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main16 {
    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<>(List.of("Mon", "Tue", "Wed", "Thu", "Fri"));
        Collections.rotate(days, 2);
        System.out.println(days);
    }
}
