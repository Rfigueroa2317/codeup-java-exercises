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

        Student student2 = new Student("Cristina");

        student2.addGrade(85);
        student2.addGrade(79);
        student2.addGrade(81);

        System.out.println(student2);

        Student student3 = new Student("Ana");

        student3.addGrade(59);
        student3.addGrade(65);
        student3.addGrade(75);

        System.out.println(student3);


        students.put("Ricardo",studentOne);
        students.put("Joel",student);
        students.put("Cristina", student2);
        students.put("Ana", student3);

        

    }
}
