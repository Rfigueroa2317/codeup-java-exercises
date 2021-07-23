package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student studentOne = new Student("Ricardo");

        studentOne.addGrade(90);
        studentOne.addGrade(80);
        studentOne.addGrade(70);

        System.out.println(studentOne.getGradeAverage());


        Student student = new Student("Joel");

        student.addGrade(91);
        student.addGrade(90);
        student.addGrade(85);

        System.out.println(student);


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
