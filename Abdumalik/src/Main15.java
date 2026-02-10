import java.util.ArrayList;
import java.util.List;

public class Main15 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4));

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int n : nums) {
            if (n % 2 == 0) even.add(n);
            else odd.add(n);
        }

        System.out.println(even);
        System.out.println(odd);
    }
}
