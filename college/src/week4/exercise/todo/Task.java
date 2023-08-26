package week4.exercise.todo;
import java.time.LocalDate;

public class Task {
     String taskName;
     String priority;
     LocalDate dueDate;
     int priorityLevel;

    public Task(String taskName, String priority){
        this.taskName = taskName;
        this.priority = priority;
    }
    public Task(String taskName, int priorityLevel){
        this.taskName = taskName;
        this.priorityLevel = priorityLevel;
        setPriority(priorityLevel);
    }

    public void setPriority(int priorityLevel) {
        if(priorityLevel>0 && priorityLevel<=3){
            this.priority = "Low";
        }
        else if (priorityLevel > 3 && priorityLevel<=7){
            this.priority = "Medium";
        }
        else if (priorityLevel>7 && priorityLevel <=10){
            this.priority = "High";
        }
        else{
            System.out.println("Invalid priority level");
        }
    }

    public Task(String taskName, LocalDate dueDate ){
        this.taskName = taskName;
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "---------------\n" + "Task : " + taskName + (priority!= null ? ("\nPriority : " + priority) : ("\nDue Date : " + dueDate)) ;
    }
}
