import java.util.HashSet;

public class Main10 {
    public static void main(String[] args) {

        String[] words = {"Apple", "apple", "APPLE", "Banana"};
        HashSet<String> set = new HashSet<>();

        for (String w : words) {
            set.add(w.toLowerCase());
        }

        System.out.println(set);
    }
}
