import java.util.HashMap;
public class Main2 {
    public static void main (String[] args){
        HashMap<String, Integer> students = new HashMap<>();
        students.put("Aida", 85);
        students.put("Azat", 92);
        students.put("Dana", 77);
        System.out.println(students.get("Aida"));
        System.out.println(students.get("Mira"));
        if(students.containsKey("Mira")){
            System.out.println("Found Mira");

        }else {
            System.out.println("Not Found Mira");
        }

    }



}