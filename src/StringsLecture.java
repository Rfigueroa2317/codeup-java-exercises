import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class StringsLecture {


    public class Strings {
        //        warmup:
//        TODO: create a new "Strings-Lecture" java class file (or wherever
//         you like to keep notes/lecture exercises. Copy given
//         code, that is your starting point. Using Scanner prompt a
//         user (in this case it's you, you're the user) to type in
//         their first name. Save the input into a String variable. If
//         your name matches randomName, print "woah! you guessed:
//         enter-randomName-here! How did you know enter-yourName-here
//         is my name?!". if randomName does
//         not
//         match your name exactly, print "Way off my friend! My name
//         isn't randomName-here. It's yourName-here.".
    }


    //        import java.util.Scanner;
//        public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] studentsArr =
                {"Amado", "Christian", "Christopher", "Corey", "Demetrio",
                        "Diamond", "Erik", "Grady", "Jesse", "Joshua",
                        "Juan", "Mitchell", "Moses", "Nathan", "Prachi",
                        "Raul", "Ricardo", "Richard", "Robert", "Sam",
                        "Sean", "Stephen", "Tiffanny", "Wagner", "Laura",
                        "Casey", "Dorian", "Tristan", "Jordy"};
        int randomNum = (int) (Math.random() * 28);
        String randomName = studentsArr[randomNum];
        /* your code goes here */

        System.out.println("What is your first name?");
        String firstName = sc.next();
        System.out.printf("You entered: ", firstName);
        if(firstName.equals(randomName)){
            System.out.println("woah! you guessed enter-randomName-here: " + randomName);
        }else{
            System.out.println("sorry, wrong name " + randomName );
        }
    }

}


