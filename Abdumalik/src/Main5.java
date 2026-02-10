import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(List.of("Red", "Blue", "Green"));

        Collections.fill(colors, "Black");
        System.out.println(colors);
    }
}
