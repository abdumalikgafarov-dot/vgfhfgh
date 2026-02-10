import java.util.ArrayList;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {
        ArrayList<String> sports = new ArrayList<>(List.of("Football", "Tennis", "Boxing"));
        ArrayList<String> sub = new ArrayList<>(List.of("Football", "Tennis"));

        System.out.println(sports.containsAll(sub));
    }
}
