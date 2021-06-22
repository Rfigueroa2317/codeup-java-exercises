import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {

        // .1
//        double pi = 3.14159;
//        System.out.printf("The value is %.3f:\n ",pi);


        // Explore the Scanner Class. \\

        // .1
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter an integer: ");
//        int myNum = scanner.nextInt();
        // You will get an exception. This applies to both a random text
        //  and a number that's outside of what an integer allows you to


        // .2
//        System.out.println("Please enter 3 words");
//        String wordOne = scanner.next();
//        String wordTwo = scanner.next();
//        String wordThree = scanner.next();
//
//        System.out.println(wordOne + " " + wordTwo + " " + wordThree);


        // .3
//        System.out.println("Please write a sentence");
//        String sentence = scanner.next();
//        System.out.println(sentence);

        // .4
//        System.out.println("Please write a sentence");
//        String sentence = scanner.nextLine();
//        System.out.println(sentence);


        // Calculate the perimeter and area of a room

        // .1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values of length and width of a room: ");
//        String value = scanner.nextLine();

        int length = scanner.nextInt();
        int width = scanner.nextInt();

        // .2
        int area = length * width;
        System.out.printf("The Total area is %s", area);

        // Bonuses


    }
}
