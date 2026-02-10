import java.util.HashSet;

public class Main6 {
    public static void main(String[] args) {

        HashSet<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);

        HashSet<Integer> setB = new HashSet<>();
        setB.add(3);
        setB.add(4);

        setA.removeAll(setB);
        System.out.println(setA);
    }
}
