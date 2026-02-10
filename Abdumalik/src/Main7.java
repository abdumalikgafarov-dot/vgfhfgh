import java.util.ArrayList;
import java.util.List;

public class Main7 {
    public static void main(String[] args) {
        ArrayList<String> flowers = new ArrayList<>(List.of("Rose", "Lily", "Rose"));

        System.out.println(flowers.indexOf("Rose"));
        System.out.println(flowers.lastIndexOf("Rose"));
    }
}
