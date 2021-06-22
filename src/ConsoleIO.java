import java.util.Scanner;

public class ConsoleIO {

    public static void main(String[] args) {
//        System.out.println("My name is Ricardo");// My name is Ricardo \n
//        // \n will add a line between souts.
//        System.out.println("Hey look! New line!");

//        String name = "Ricardo";
//        System.out.printf("My name is %s", name);
        // making the 's' to 'S' will turn your string in all capital letters.

//        String mySentence = String.format("My name is %s", name);
//        System.out.println(mySentence);

//        String role = "student";
//        String hobby = "Music";

//        String sentence = String.format("My name is %s\n. I'm a %s at Codeup and I play %s  in my down time.", name, role, hobby);
        // work on this one. start with just one and then keep adding to it.

//        float currencyInPennies = 1000;
//
//        System.out.printf("I'll sell you swamp land for $%.2f per acre", currencyInPennies);


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your full name?");
//        String firstName = scanner.next();
////        System.out.printf("You entered: %s\n", firstName);
//        String lastName = scanner.next();
//        System.out.printf("Your first name is: %s\n", firstName);
//        System.out.printf("Your last name is: %s\n", lastName);

        /* TODO: use the scanner to take in the name of the month you were born and print it back out
            - remember to first prompt the user for the input
 */
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("What month were you born in?");
//            String monthName = scanner.next();
//            System.out.printf("Your birth month is: %s\n", monthName);

        // *** NEXT INT ***
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        String myString = scanner.next();
//        int myNum = scanner.nextInt();
//        System.out.println(myNum);

//        String myString = scanner.nextLine();
//        System.out.println(myString);

////        while (scanner.hasNext()){
////            String word = scanner.next();
////
////            if (word.equals("break")){
////                break;
////            }
////            System.out.println(word);
//        }

        for (int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }
}
