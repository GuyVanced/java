package week4.exercise.todo;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ToDoList {

    LinkedList<Task> link = new LinkedList<>();
    LinkedTodo linkedTodo = new LinkedTodo();
    ArrayTodo arrayTodo = new ArrayTodo();

    public static void main(String[] args) {
        ToDoList todolist = new ToDoList();
        todolist.arrayTodo.init();
        todolist.linkedTodo.init();
    }

    class LinkedTodo {

        public void init() {
            link.add(new Task("Wash the dishes",2));
            link.add(new Task("Clean your room", 3));
            link.add(new Task("Learn Python", 8));
            link.add(new Task("Complete the assignment", 9));
            displayEvenPriority();
        }

        public void displayEvenPriority() {
            Iterator<Task> iterator1 = link.iterator();
            while (iterator1.hasNext()) {
                Task task = iterator1.next();
                if (task.priorityLevel % 2 == 0) {
                    System.out.println(task.taskName);
                }
            }
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

    class ArrayTodo{

        ArrayList<Task> list = new ArrayList<Task>();
        public void init() {
            list.add(new Task("Complete report", LocalDate.of(2023, 12, 26)));
            list.add(new Task("Call client", LocalDate.of(2023, 10, 28)));
            list.add(new Task("Pay Bills", LocalDate.of(2023, 7, 20)));

            list.get(2).dueDate = LocalDate.of(2024, 1, 2);

            displayEarliestTask();
        }

        public void withinTwoDays(){
            Iterator<Task> iterator = list.iterator();

            while(iterator.hasNext()){
                Task task = iterator.next();
                Period period = Period.between(LocalDate.now(), task.dueDate);

                if(period.getDays()<=2){
                    System.out.println(task);
                }
            }
        }

        public void displayEarliestTask(){
            Iterator<Task> iterator = list.iterator();
            Task task = iterator.next();
            LocalDate earliest = task.dueDate;
            Task earliestTask = task;

            while(iterator.hasNext()){
                task = iterator.next();
                if(task.dueDate.isBefore(earliest)){
                    earliest = task.dueDate;
                    earliestTask = task;
                }
            }
            System.out.println(earliestTask);
        }

    }


}


