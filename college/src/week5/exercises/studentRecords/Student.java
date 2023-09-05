package week5.exercises.studentRecords;

import java.util.*;

public class Student {
    private final int Id;
    private final String name;
    private double averageScore;
    Map<String , Double> scores;

    public Student(int Id, String name, Map<String,Double> scores){
        this.Id  = Id;
        this.name = name;
        this.scores = scores;
    }

    public double getAverageScore(){
        double totalScore = 0;
        for(double score : scores.values()){
            totalScore += score;
        }
        return totalScore/scores.size();

    }

    public String toString() {
        return "Student ID: " + Id + " || Name: " + name + " || Average Score: " + getAverageScore();
    }
}
