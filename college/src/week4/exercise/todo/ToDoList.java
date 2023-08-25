package week4.exercise.todo;
import java.util.LinkedList;

public class ToDoList {


    LinkedList<Task> link = new LinkedList<>();
    Question1 question1 = new Question1();

    public static void main(String[] args) {
        ToDoList todo = new ToDoList();
        todo.question1.init();

    }

    class Question1 {

        public void init() {
            link.add(new Task("Wash the dishes", "High"));
            link.add(new Task("Clean your room", "High"));
            link.add(new Task("Learn Python", "Low"));
            link.add(new Task("Complete the assignment", "Medium"));
            display();
            removeLow(link);
            display();
            displayMedium();
        }

        public void display() {
            System.out.println("**************************************");
            for (Task task : link) {
                System.out.println(task);
            }
        }

        public void displayMedium(){
            System.out.println("*****************************************");
            for (Task task : link) {
                if (task.priority.equals("Medium")) {
                    System.out.println(task);
                }
            }
        }

        public void removeLow(LinkedList<Task> link) {
            link.removeIf(task -> task.priority.equals("Low"));
        }
    }
}


