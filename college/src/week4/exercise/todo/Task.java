package week4.exercise.todo;
import java.time.LocalDate;

public class Task {
     String taskName;
     String priority;
     LocalDate dueDate;

    public Task(String taskName, String priority){
        this.taskName = taskName;
        this.priority = priority;
    }

//    public Task(String taskName, LocalDate dueDate ){
//        this.taskName = taskName;
//        this.dueDate = dueDate;
//    }

    @Override
    public String toString() {
        return "---------------\n" + "Task : " + taskName + "\nPriority : " + priority;
    }
}
