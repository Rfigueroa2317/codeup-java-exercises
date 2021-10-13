import java.util.Scanner;

public class ConsoleIOReview {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter something: ");
//        String userInput = scanner.next();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

        String userInput = scanner.nextLine();

        double pi = 3.14159;
        System.out.println("The output of pi is approximately 3.14");
        System.out.format(userInput);

        System.out.println("This is today's push");

        if (userInput == " "){
            System.out.println("Hello there!");
        }else{
            return;
        }





    }


}
