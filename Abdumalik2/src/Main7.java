import java.util.HashSet;

public class Main7 {
    public static void main(String[] args) {

        HashSet<Integer> setX = new HashSet<>();
        setX.add(1);
        setX.add(2);
        setX.add(3);

        HashSet<Integer> setY = new HashSet<>();
        setY.add(2);
        setY.add(3);
        setY.add(4);

        setX.retainAll(setY);
        System.out.println(setX);
    }
}
