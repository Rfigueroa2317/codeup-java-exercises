package ExceptionsAndErrorHandling;

public class ExceptionsAndErrorHandlingExamples {
    public static void main(String[] args) {

        // *** Throwing Exceptions *** \\\

        // Exceptions are a feature of the Java language to provide a formalized
        // way to do error handling. Exceptions are an instance of one of several
        // different Exception classes, or a class that extends one of the
        // built-in exception classes.

        // Exceptions generally contain a 'message' that describes what went wrong.
        // We say that an exception is 'thrown' when the application can't perform
        // an operation.

        // Here's an exception when working with arrays:

//        int[] numbers = {1,2,3};
//        System.out.println(numbers[999]); // the exception is on the obj brackets.

        // When the above code is run, an 'ArrayIndexOutOfBounds' exception will be
        // 'thrown' and we'll see the exception message: in this case it is the index
        // that is out of bounds, [999].

        // In this example, the exception was thrown for us by the Java language's
        // array implementation, but we can also explicitly throw our own exception:

//        throw new Exception("Something bad happened!");

        // This code block will cause an exception. It is important to note that
        // exceptions effect the control flow of your application. Once an exception
        // is thrown, no code after the thrown exception will be executed until the
        // exception is handled. To illustrate this, take a look at this code:

//        throw new Exception("Something bad happened!");
//        System.out.println("after the throw statement");

        // The above code, if run by itself, will cause the application to crash when
        // the exception is thrown. We will never see 'after the throw statement'
        // printed in the console.


        // *** Catching Exceptions *** \\

        // Instead of crashing our application, we can handle exceptions by
        // 'catching' them. We do this with a 'try-catch' block. A try-catch
        // block consists of two parts:

        //  .Try = the code that is going to be tried; code that could potentially
        //          cause and exception.

        //  .catch = code that handles any exceptions (if produced).

        // When we create a try-catch block, we must define the type of exception
        // we are looking for. This is similar to defining a method paramenter,
        // in that we must specify a type, in this case a type of exception,
        // and an identifier. By convention, this will almost always be 'e', but
        // you can use any valid Java identifier here.

        // Here is a generic form of what a try-catch block looks like:

//        try {
//            // something that
//            // might go wrong
//        } catch (Exception e) {
//            // handle the error
//        }

        // Ex:

//        try {
//            System.out.println("Let's see...");
//            int result = 1/ 0;
//            System.out.println("I can divide by zero!");
//        } catch (ArithmeticException e) {
//            System.out.println("Math still works!");
//        }

        // Gives you the output:
            // Let's see...
            //Math still works!

        // When we try to divide by zero on the second line in the 'try' block,
        // and 'ArithmeticException' is thrown. The next line in the block is
        // skipped. Because we have a catch block that specifies that it is
        // looking for an 'ArithmeticException', our application does not crash
        // and print out a stack trace; instead, control is transferred to the
        // body of the 'catch' block.

        // We can specify multiple 'catch' blocks as part of a try-catch, but
        // only the most specific of them will ever run. We can also specify a
        // 'finally' block that will always run, regardless of if an exception
        // is thrown or not.

        int[] numbers = {1,2,3};
        int x;

        try {
            x = numbers[100];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an array index exception!");
        } catch (Exception e) {
            System.out.println("Caught a generic exception!");
        } finally {
            System.out.println("This will always run.");
        }

        // It will output:
        // Caught an array index exception!
        // This will always run.

        // Note that only the most specific catch block executes. In the above
        // example, we never reach the catch block for 'Exception' because a
        // more specific catch block was invoked.

        // *** Try-Catch Scope *** \\

        // A try-catch block is a code block just like a body of an 'if'
        // statement, or the body of a while loop is. Because of the way block
        // scope works in Java, variables declared inside a try or catch block
        // ** only exist in that block. **
        // ** If you need to do assignment inside of a try-catch, declare the
        // variables outside of the block, and assign to them inside the block. **

        // So far, we have not used 'e', the object that represents the error
        // that occurred. This object does have a handful of useful methods
        // on it, most notably:

        //  .getMessage = returns the exception message as a string

        //  .printStackTrace = prints the full details of the exception
        //              (where it occurred) to the console.

        // **** 'e' is the object that represents the error that occurred.
        //  'e' is just a variable. It stands for exception, but you can
        //  rename it anything you like, however, the type has to remain
        // 'Exception'. The 'e' variable stores an exception-type
        // object in this case.


        // *** Types of Exceptions *** \\


        // *** TO BE CONTINUED *** \\

    }
}
