import java.util.ArrayDeque;

public class Main21 {

    static ArrayDeque<String> tasks = new ArrayDeque<>();

    static void addTask(String task, boolean highPriority) {
        if (highPriority) {
            tasks.addFirst(task);
        } else {
            tasks.addLast(task);
        }
    }

    static void processTask() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks");
        } else {
            System.out.println("Processing: " + tasks.pollFirst());
        }
    }

    public static void main(String[] args) {

        addTask("Email", false);
        addTask("Fix bug", true);
        addTask("Meeting", false);

        processTask();
        processTask();
        processTask();
        processTask();
    }
}
