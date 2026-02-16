import java.util.HashMap;
public class Main8 {
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
                    System.out.println("Is the map empty" + students.isEmpty());
                    students.clear();
                    System.out.println("Is the map empty after clear?" + students.isEmpty());
                    students.put("Aida", 85);
                    students.put("Dana", 80);
                    int scoreAida = students.getOrDefault("Aida", -1);
                    System.out.println(scoreAida);
                    int scoreMira = students.getOrDefault("Mira", -1);
                    System.out.println(scoreMira);
                    if (scoreMira == -1){
                        System.out.println("Mira not Found");
                        students.putIfAbsent("Aida", 90);
                        System.out.println(students);
                        students.putIfAbsent("Mira", 88);
                        System.out.println(students);
                        Boolean replaced = students.replace("Aida", 85, 86);
                        System.out.println(replaced);
                        System.out.println(students);
                        //ключи
                        for (String key : students.keySet()){
                            System.out.println(key);
                            //значение
                           for (Integer Value : students.values()){
                                System.out.println(Value);
                               //ключь зачения
                                for (var entry : students.entrySet()){
                                   System.out.println(entry);
                                }
                            }


                        }


                    }
                }

            }

        }

    }



}