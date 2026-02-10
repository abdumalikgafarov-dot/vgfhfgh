import java.util.ArrayList;
import java.util.List;

public class Main18 {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>(List.of("Up", "Avatar", "Titanic"));
        movies.sort((a, b) -> b.length() - a.length());
        System.out.println(movies.get(1));
    }
}
