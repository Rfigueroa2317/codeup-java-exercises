import java.util.Scanner;
import org.w3c.dom.ls.LSOutput;

public class ControlFlowExercises {
    public static void main(String[] args) {

        // .1 Loop Basics
        // a. While
//        int i = 5;
//        while (i <= 15){
//            System.out.println("i is: " + i);
//            i++;
//        }

        // b. Do While
//        int i = 0;
//        do {
//            System.out.println("The number is now: " + i * 2);
//            i++;
//        }while(i <= 50);
        // Not the right answer. ask about it tomorrow

        // c. For Loop
//        for(int i = 5; i <= 15; i++){
//            System.out.println("i is: " + i);
//        }

//        for(int i = 0; i <= 100; i++){
//            System.out.println("The number is now: " + i * 2);
        // Not the right answer. Ask about it tomorrow
//          }



        // .2 Fizzbuzz
//        for(int i = 1; i <=100; i++){
//            if(i % 15 == 0){
//                System.out.println("fizzbuzz " + i);
//            } else if(i % 5 == 0){
//                System.out.println("buzz " + i);
//            } else if(i % 3 == 0){
//                System.out.println("fizz " + i);
//            }else{
//                System.out.println(i);
//            }
//        }

        // .3 Display a table of powers

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter an integer: ");
//        int input = sc.nextInt();
//        System.out.println("");
//        System.out.println("Here is your table!");
//        System.out.println("");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//
//        for (int i = 1; i <= input; i++){
//            System.out.println(i + "      | " + (i * i) + "       |" + "  " +(i * i * i));
//        }

        // .4 Convert given number grades into letter grades.

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a grade from 0 - 100: ");
        int input = sc.nextInt();
        if(input == 100){
            System.out.println("That's an A!");
//           *** work on this one ***
        }
    }
}
