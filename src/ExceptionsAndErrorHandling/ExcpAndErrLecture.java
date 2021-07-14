package ExceptionsAndErrorHandling;

import java.util.ArrayList;

public class ExcpAndErrLecture {

    public static void main(String[] args) {

        // common Exception examples
        // parseInt Exception
//        int myNum = Integer.parseInt("eighteen");

        // ARRAY EXCEPTION
//        ArrayList<Integer> myArrList = new ArrayList<Integer>();
//        myArrList.get(2);


        // THROW
//        impossible(8, 1);

        newBankAccount(201, 17);
    }


    // Exception = a way for Java to handle our any errors in our code
    // and instance of one of several exception classes
    // Exception is gonna be thrown to us in the flow of our code

    // thrown = a warning being put on your code to let you know something's wrong
    // "Kind of like a football ref throws a flag in the field when a
    // player does something against the rules or something"


    // *** Throwable *** \\
    //  .throw --> exception


    // THROW syntax
//    public static void impossible(int num1, int num2) {
//        if (num2 == 1) {
//            // throw new
//            throw new ArithmeticException();
//        } else {
//            System.out.println(num1 / num2);
//        }
//    }

    // TODO: Let’s say that you’re writing a program that checks
    //  whether or not a user is eligible to open up a new bank account.
    //  The requirements are that they have to be older than 16 years
    //  old and have at least $200 to start their bank account.
    //  Write a method that will return a string that states whether
    //  they’re eligible to bank at Banco di Laura or whether they are
    //  not eligible, make sure to  throw an `NumberFormatException` if
    //  the user inputs anything that’s not a number (none, zero, zilch, nada, etc).

    public static void newBankAccount(int Acct, int Age){
        if((Age <= 16) && (Acct <= 200)){
            throw new ArithmeticException();
        }else {
            System.out.println("Congrats you qualify!");
        }
    }

}
