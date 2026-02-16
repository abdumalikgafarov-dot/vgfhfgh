import java.util.HashMap;
import java.util.ArrayList;
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
        int Itemcount = 0;
        for (Integer value : students.values()) {
            if (value >= 80) {
                Itemcount++;
            }
        }
        System.out.println("\nStudents with score >= 80: " + Itemcount);
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
   //12

        String text = "Java is fun and Java is powerful and fun";
        text = text.toLowerCase();

        HashMap<String, Integer> words = new HashMap<>();
        for (String word : text.split(" ")) {
            words.put(word, words.getOrDefault(word, 0) + 1);
        }
        System.out.println(words);
//13
        String s = "mississippi";
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        System.out.println(freq);
//14
        String[] arr = {"book", "java", "sun", "loop", "map"};
        HashMap<Integer, ArrayList<String>> map = new HashMap<>();

        for (String w : arr) {
            map.computeIfAbsent(w.length(), k -> new ArrayList<>()).add(w);
        }
        System.out.println(map);
//15
        String str = "swiss";
        HashMap<Character, Integer> m = new HashMap<>();

        for (char c : str.toCharArray())
            m.put(c, m.getOrDefault(c, 0) + 1);

        char result = ' ';
        for (char c : str.toCharArray()) {
            if (m.get(c) == 1) {
                result = c;
                break;
            }
        }
        System.out.println(result == ' ' ? "None" : result);
//16
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (hm.containsKey(need)) {
                System.out.println(hm.get(need) + ", " + i);
                break;
            }
            hm.put(nums[i], i);
        }
//17
        String[] items = {"apple","banana","apple","orange","banana","kiwi"};
        HashMap<String, Integer> count = new HashMap<>();

        for (String item : items)
            count.put(item, count.getOrDefault(item, 0) + 1);

        for (var e : count.entrySet()) {
            if (e.getValue() > 1)
                System.out.println("Duplicate: " + e);
        }
//18
        HashMap<String,Integer> m1 = new HashMap<>();
        HashMap<String,Integer> m2 = new HashMap<>();

        m1.put("A",1); m1.put("B",2);
        m2.put("B",2); m2.put("A",1);

        System.out.println(m1.equals(m2)); // true
//19
        HashMap<String,Integer> scores = new HashMap<>();
        scores.put("Aida", 85);
        scores.put("Dana", 55);
        scores.put("Mira", 40);

        scores.entrySet().removeIf(e -> e.getValue() < 60);
        System.out.println(scores);
//20
        HashMap<String,Integer> s1 = new HashMap<>();
        HashMap<String,Integer> s2 = new HashMap<>();

        s1.put("Aida",40); s1.put("Azat",35);
        s2.put("Azat",10); s2.put("Dana",5);

        for (var e : s2.entrySet())
            s1.merge(e.getKey(), e.getValue(), Integer::sum);

        System.out.println(s1);
//21
        HashMap<String,Integer> scoresMap = new HashMap<>();
        scoresMap.put("Aida",90);
        scoresMap.put("Azat",90);
        scoresMap.put("Dana",80);

        HashMap<Integer, ArrayList<String>> inv = new HashMap<>();

        for (var e : scoresMap.entrySet()) {
            inv.computeIfAbsent(e.getValue(), k -> new ArrayList<>()).add(e.getKey());
        }
        System.out.println(inv);
//22
        String txt = "java java code fun fun fun";
        HashMap<String,Integer> fm = new HashMap<>();

        for (String w : txt.split(" "))
            fm.put(w, fm.getOrDefault(w,0)+1);

        String first="", second="";
        int f1=0, f2=0;

        for (var e : fm.entrySet()) {
            if (e.getValue() > f1) {
                f2=f1; second=first;
                f1=e.getValue(); first=e.getKey();
            } else if (e.getValue() > f2) {
                f2=e.getValue(); second=e.getKey();
            }
        }
        System.out.println(first + ", " + second);

    }
}
