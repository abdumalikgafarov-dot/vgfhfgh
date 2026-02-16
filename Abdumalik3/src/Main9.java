import java.util.HashMap;

public class Main9 {
    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();

        // 1. Create & Put
        students.put("Aida", 85);
        students.put("Azat", 92);
        students.put("Dana", 77);

        System.out.println("Initial map: " + students);
        System.out.println("Size: " + students.size());

        // 2. Get & containsKey
        System.out.println("Aida score: " + students.get("Aida"));
        System.out.println("Mira score: " + students.get("Mira"));

        if (students.containsKey("Mira")) {
            System.out.println("Found Mira");
        } else {
            System.out.println("Not Found Mira");
        }

        // 3. Update existing value
        Integer oldValue = students.put("Dana", 80);
        System.out.println("Old Dana score: " + oldValue);
        System.out.println("After update: " + students);

        // 4. Remove
        Integer removed = students.remove("Azat");
        if (removed != null) {
            System.out.println("Azat removed");
        }

        Integer removed2 = students.remove("NonExisting");
        if (removed2 == null) {
            System.out.println("NonExisting not found");
        }

        System.out.println("After remove: " + students);

        // 5. isEmpty & clear
        System.out.println("Is empty: " + students.isEmpty());
        students.clear();
        System.out.println("Is empty after clear: " + students.isEmpty());

        // Reinsert
        students.put("Aida", 85);
        students.put("Dana", 80);

        // 6. getOrDefault
        System.out.println("Aida score: " + students.getOrDefault("Aida", -1));
        int miraScore = students.getOrDefault("Mira", -1);
        if (miraScore == -1) {
            System.out.println("Mira not found");
        }

        // 7. putIfAbsent
        students.putIfAbsent("Aida", 90);
        students.putIfAbsent("Mira", 88);
        System.out.println("After putIfAbsent: " + students);

        // 8. replace
        boolean replaced = students.replace("Aida", 85, 86);
        System.out.println("Replaced Aida? " + replaced);
        System.out.println("After replace: " + students);

        // 9. Iterate
        System.out.println("\nKeys:");
        for (String key : students.keySet()) {
            System.out.println(key);
        }

        System.out.println("\nValues:");
        for (Integer value : students.values()) {
            System.out.println(value);
        }

        System.out.println("\nEntries:");
        for (var entry : students.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // 10. Count score >= 80
        int count = 0;
        for (Integer value : students.values()) {
            if (value >= 80) {
                count++;
            }
        }
        System.out.println("\nStudents with score >= 80: " + count);
   //11
   String beststudents="";
   int bestScore = -1;

      for (var entry : students.entrySet()){
        if (entry.getValue() > bestScore){
         bestScore = entry.getValue();
         beststudents = entry.getKey();

}
   }
        System.out.println("Best student:"+ beststudents);
        System.out.println("Best score:" + bestScore);
        String maxstudents="";
        int maxscore = -1;

         for (var entry : students.entrySet()){
             if (entry.getValue()> maxscore){
                 maxscore = entry.getValue();
                 maxstudents= entry.getKey();
             }
         }
        System.out.println("student whith max core:"+ maxstudents);
        System.out.println("Max score:" + maxscore);
    }
}
