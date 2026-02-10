import java.util.ArrayList;

public class Main17 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Ali");
        students.add(null);
        students.add("John");

        students.removeIf(s -> s == null);
        System.out.println(students);
    }
}
