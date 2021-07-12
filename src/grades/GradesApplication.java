package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {

        Student studentOne = new Student("RicardoWhatever");

        studentOne.addGrade(90);
        studentOne.addGrade(80);
        studentOne.addGrade(70);

        System.out.println(studentOne.getGradeAverage());

        HashMap<String, String> students = new HashMap<>();
        // how to assign the github username as a key within the HashMap
        // how to assign a `Student` object as the value
        // how to save 3 grades inside of the `Student` obj

        students.put("Ryan", "ryanorsinger");
        students.put("Zach","zgulde");
        students.put("Fernando", "fmendozaro");
        students.put("Justin", "jreich5");

        {"ryanorsinger" {grades: 90, 80, 70}}

        System.out.println(students);
    }
}
