import java.util.ArrayList;
import java.util.List;

public class Main13 {
    public static void main(String[] args) {
        ArrayList<String> songs = new ArrayList<>(List.of("Hello", "Hi", "Goodbye"));

        String shortest = songs.get(0);
        for (String s : songs) {
            if (s.length() < shortest.length()) {
                shortest = s;
            }
        }
        System.out.println(shortest);
    }
}
