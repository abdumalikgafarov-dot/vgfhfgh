import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>(List.of("Up", "Avatar", "Titanic"));

        String longest = movies.get(0);
        for (String m : movies) {
            if (m.length() > longest.length()) {
                longest = m;
            }
        }
        System.out.println(longest);
    }
}
