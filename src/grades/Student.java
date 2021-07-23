package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

    public static void main(String[] args) {

    }

    private String name;

    private ArrayList<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public boolean yesNo() {
        return true;
    }

}
