import java.util.HashSet;

public class Main5 {
    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        set1.addAll(set2);
        System.out.println(set1);
    }
}
