package week5.exercises.studentRecords;

import java.sql.SQLOutput;
import java.util.*;

public class RecordManager {
    Scanner scan = new Scanner(System.in);
    SortedMap<Integer, Student> students = new TreeMap<>();
    SortedSet<Student> topStudents = new TreeSet<>(Comparator.comparingDouble(Student::getAverageScore).reversed());

    public static void main(String[] args) {
        RecordManager record = new RecordManager();
        record.init();
    }

    public void init(){
        addStudent();
        topStudents.addAll(students.values());
        showTopStudents();
    }

    public void showTopStudents(){
        System.out.println("-------------------------------------------");
        System.out.println("\tTop 3 Students : ");
        int  position = 1;
        for(Student student : topStudents){
            if(position>3){
                break;
            }
            System.out.println(" \t" + position + ". " + student);
            position++;
        }
    }

    public void addStudent(){
        while (true) {
            System.out.println("-------------------------------------------");
            System.out.print("\tEnter Student ID (0 to exit): ");
            int id = scan.nextInt();
            if (id == 0) {
                break;
            }
            System.out.print("\tEnter Student Name: ");
            String name = scan.next();

            Map<String, Double> scores = new HashMap<String, Double>();

            System.out.println("\tEnter Scores for Subjects");

            System.out.print("\t\tMath : ");
            scores.put("Math", scan.nextDouble());
            System.out.print("\t\tScience : ");
            scores.put("Science", scan.nextDouble());
            System.out.print("\t\tHistory : ");
            scores.put("History", scan.nextDouble());

            Student student = new Student(id, name, scores);
            students.put(id, student);
        }
    }
}
