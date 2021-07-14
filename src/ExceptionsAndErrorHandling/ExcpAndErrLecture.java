package ExceptionsAndErrorHandling;

import java.util.ArrayList;

public class ExcpAndErrLecture {

    public static void main(String[] args) {

        // common Exception examples
        // parseInt Exception
//        int myNum = Integer.parseInt("eighteen");

        // ARRAY EXCEPTION
        ArrayList<Integer> myArrList = new ArrayList<Integer>();
        myArrList.get(2);


        // THROW
        impossible(8,1);
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
    public static void impossible(int num1, int num2){
        if(num2 == 1){
            // throw new
            throw new ArithmeticException();
        }else{
            System.out.println(num1 / num2);
        }

    }
}
