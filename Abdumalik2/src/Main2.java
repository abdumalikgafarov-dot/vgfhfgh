import java.util.HashSet;

public class Main2 {

    static boolean isAllowed(HashSet<String> users, String name) {
        return users.contains(name);
    }

    public static void main(String[] args) {

        HashSet<String> users = new HashSet<>();
        users.add("Ali");
        users.add("John");
        users.add("Sara");

        System.out.println(isAllowed(users, "John"));
        System.out.println(isAllowed(users, "Mike"));
    }
}
