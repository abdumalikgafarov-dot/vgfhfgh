import java.util.HashSet;

public class Main4 {
    public static void main(String[] args) {

        HashSet<String> names = new HashSet<>();
        names.add("Aida");
        names.add("Bek");
        names.add("Timur");
        names.add("Asel");
        names.add("Nursultan");

        boolean removed = names.remove("Timur");

        System.out.println(removed);
        System.out.println(names);
    }
}
