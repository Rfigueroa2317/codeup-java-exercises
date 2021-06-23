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

//        String user1 = "Ricardo";
//        String user2 = "Ana";
//        String user3 = "Joel";

//        String user1 = scanner.next();
//        String user2 = scanner.next();
//        String user3 = scanner.next();

//        System.out.println("Please enter a username: ");
//        String fourthUser = scanner.next();

//        if(fourthUser.equalsIgnoreCase(user1) || fourthUser.equalsIgnoreCase(user2) || fourthUser.equalsIgnoreCase(user3)){
//            System.out.printf("Sorry, this username already exists.", fourthUser);
//        }else{
//            System.out.printf("You're in!",fourthUser);
//        }

        // another way to do it:

//        if(fourthUser.equals(user1) || fourthUser.equals(user2) || fourthUser.equals(user3)){
//            System.out.println("Sorry, this username already exists.");
//        }else{
//            System.out.println("You're in!");
//        }


        // Switch Statements
//        char grade = 'C';
//
//        switch ( grade ){
//            case 'A' :
//                System.out.println("Great Job!!");
//                break;
//            case 'B':
//                System.out.println("great job!");
//                break;
//            case 'C':
//                System.out.println("not bad");
//                break;
//            case 'D':
//                System.out.println("Try again");
//            default:
//                System.out.println("grades are just letters");

                // Not having a break in between the case will run all of them
                //ex: if you type A on 'char grade = '';' will cause to run
                // all of them. By adding the break it will stop at whatever
                // letter is assigned to char grade = '';



                //TODO: refactor your code from the previous mini exercise
                // into a switch statement.

//                String user1 = "Ricardo";
//                String user2 = "Ana";
//                String user3 = "Joel";
//
//                System.out.println("Please enter a username: ");
//                String fourthUser = scanner.next();


//                switch (fourthUser){
//                    case "Ricardo":
//                        System.out.println("Sorry, this username already exists.");
//                        break;
//                    case "Ana":
//                        System.out.println("Sorry, this username already exists.");
//                        break;
//                    case "Joel":
//                        System.out.println("Sorry, this username already exists.");
//                        break;
//                    default:
//                        System.out.println("You're in!");
//                        break;
//
//                        // default works as a 'place holder' for any other input
//                        //  you wanna type in other than the ones already established
//                }



                // while vs do...while loop:
        //          condition is checked before
        //          do ... while will always be executed first before
        //          condition is met

//                    int myNum = 0;

//                    while(myNum <= 10){
//                        System.out.println(myNum);
//                        myNum++;
//                    }

                    // do ... while
//                    do {
//                        System.out.println(myNum);
//                        myNum++;
//                    } while(myNum <= 10);


//                    for loop

                    for(int myNum = 0; myNum <=20; myNum++){
                        System.out.println(myNum);
                    }

        //TODO: using previous mini exercise, allow the user to input
        // a new username several times until a unique username is entered.

//                String user1 = "Ricardo";
//                String user2 = "Ana";
//                String user3 = "Joel";

                for(){

                }

        }


    }
//}
