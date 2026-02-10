import java.util.ArrayList;
import java.util.List;

public class Main14 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(List.of("apple", "banana"));

        for (int i = 0; i < words.size(); i++) {
            words.set(i, words.get(i).replaceAll("[aeiouAEIOU]", "*"));
        }
        System.out.println(words);
    }
}
