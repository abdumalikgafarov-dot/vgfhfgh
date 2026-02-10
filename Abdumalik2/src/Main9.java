import java.util.HashSet;

public class Main9 {
    public static void main(String[] args) {

        String sentence = "java is easy and java is powerful";
        String[] words = sentence.split(" ");

        HashSet<String> set = new HashSet<>();
        for (String w : words) {
            set.add(w);
        }

        System.out.println(set);
    }
}
