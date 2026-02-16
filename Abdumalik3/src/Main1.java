import java.util.HashMap;

public class Main1 {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        students.put("aida", 85);
        students.put("azat", 92);
        students.put("dana", 77);


        System.out.println(students);
        System.out.println(students.size());
        System.out.println(students.get("aida"));
        System.out.println(students.get("mira"));
        if (students.containsKey("mira")) {
            System.out.println("mira found");

        } else {
            System.out.println("mira not found");
            students.put("dana", 80);
            students.remove("azat");
            students.remove("NonExisting");
            System.out.println(students.isEmpty());
            students.clear();


        }
    }
}