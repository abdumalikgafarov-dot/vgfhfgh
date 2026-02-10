import java.util.HashSet;

public class Main {
  public static void main(String[] args) {

    int[] nums = {1, 2, 2, 3, 4, 4, 4, 5};
    HashSet<Integer> set = new HashSet<>();

    for (int n : nums) {
      set.add(n);
    }

    System.out.println(set);
  }
}
