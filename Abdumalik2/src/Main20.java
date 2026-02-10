import java.util.ArrayDeque;

public class Main20 {
    public static void main(String[] args) {

        String s = "level";
        ArrayDeque<Character> d = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            d.addLast(c);
        }

        boolean isPalindrome = true;

        while (d.size() > 1) {
            if (d.pollFirst() != d.pollLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);
    }
}
