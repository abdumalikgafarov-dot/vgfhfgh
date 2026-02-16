import java.util.HashMap;
public class Main3 {
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
            Integer oldValue = students.put ("Dana", 80);
            System.out.println(oldValue);
            System.out.println(students);
            Integer removedValue = students.remove("Azat");
            if (removedValue !=null ){
                System.out.println("Azat removed");
                Integer removed2 = students.remove("NonExisting");
                if (removed2==null) {
                    System.out.println("NonExisting not found");
                    System.out.println(students);
                }

            }

        }

    }



}