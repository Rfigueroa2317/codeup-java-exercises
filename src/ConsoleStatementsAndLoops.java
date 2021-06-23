import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ConsoleStatementsAndLoops {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);


        // control flow:


        // boolean expressions && relational operators
        // equality, inequality, greater than, less than, equal
        // equality ==
        // inequality !=
        // greater than > // >=
        // less than < // <=
        // equal =

        // You don't need to use strict operators in Java as
        // the language is already a strict language.
        // ex: ===;

//        int chanceOfRain = 60;
//        if (chanceOfRain >= 50){
//            System.out.println("stay inside");
//        }

        // ** && will stop evaluating if the first condition is false
        // ** & will still read both conditions no matter what - is a
        // ** bitwise so it checks it bit by bit
        boolean isWarm = true;
        boolean isSunny = true;
//        if(isWarm && isSunny){
//            System.out.println("go swimming");
//        }

//        if(isWarm & isSunny){
//            System.out.println("2nd: go swimming");
//        }


//        if(isWarm || isSunny){
//            System.out.println("go swimming");
//        }
//
//        if(isWarm | isSunny){
//            System.out.println("2nd go swim");
//        }



        //String comparison Java
//        String myName = "Ricardo";
//        String yourName = "Ana";

        // .equals()
//        System.out.println(myName.equals(yourName));
        //This will get you a false regardless if both names are the same
        //  but one has a lower case at the beginning;

        //.equalsIgnoreCase
//        System.out.println(myName.equalsIgnoreCase(yourName));
        // This will ignore the lower case so if both names are the 'same'
        //  You'll get a true;

        //Control Structures

        // If Statement
//        if(/*condition*/){
//            // execute code if condition is met to be true
//        }


//        if(yourName.equalsIgnoreCase(myName)){
//            System.out.println("we are twins that is it.");
//            // this is another way to explain the .equalsIgnoreCase;
//        }


        //        MINI EXERCISE
        // TODO: create three unique usernames (user1, user2, user3).
        //  create a fourth user and set it equal to user input. (ask
        //  the user to enter a username). if the username has already
        //  been used by user1, user2, or user3, print "sorry this
        //  username already exists.

        Scanner scanner = new Scanner(System.in);

        String user1 = "Ricardo";
        String user2 = "Ana";
        String user3 = "Joel";

//        String user1 = scanner.next();
//        String user2 = scanner.next();
//        String user3 = scanner.next();

        String fourthUser = "userInput";
        System.out.println("Please enter a username: ");
        scanner.nextLine();

        if(fourthUser != user1){
            System.out.println("Sorry, this username already exists.");
        }else{
            System.out.println("You're in!");
        }


//        if(fourthUser != user1| user2 | user3){
//            System.out.println("Sorry, this user already exists");
//        }


    }
}
