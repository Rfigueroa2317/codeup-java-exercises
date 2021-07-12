package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {

        Student studentOne = new Student("RicardoWhatever");

        studentOne.addGrade(90);
        studentOne.addGrade(80);
        studentOne.addGrade(70);

        System.out.println(studentOne.getGradeAverage());

        // created hashMap with the key = string, value = Student instance
        HashMap<String, Student> students = new HashMap<>();
        // how to assign the github username as a key within the HashMap
        // how to assign a `Student` object as the value
        // how to save 3 grades inside of the `Student` obj


        // 1. create a new instance of a Student class (Student one = new Student())
        // 2. one.addGrades(88) to the `one` student instance
        // 3. students.put(username, one)
//        students.put("ryanorsinger", );
//        students.put("Zach","zgulde");
//        students.put("Fernando", "fmendozaro");
//        students.put("Justin", "jreich5");

//        {"ryanorsinger" {grades: 90, 80, 70}}

        System.out.println(students);
    }
}
