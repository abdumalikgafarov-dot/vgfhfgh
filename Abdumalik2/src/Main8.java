import java.util.HashSet;

public class Main8 {
    public static void main(String[] args) {

        HashSet<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);

        HashSet<Integer> setB = new HashSet<>();
        setB.add(2);
        setB.add(3);

        if (setA.containsAll(setB)) {
            System.out.println("setA contains all elements of setB");
        } else {
            System.out.println("setA does not contain all elements of setB");
        }
    }
}
