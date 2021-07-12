package grades;

public class GradesApplication {
    public static void main(String[] args) {

        Student studentOne = new Student("RicardoWhatever");

        studentOne.addGrade(90);
        studentOne.addGrade(80);
        studentOne.addGrade(70);

        System.out.println(studentOne.getGradeAverage());
    }
}
