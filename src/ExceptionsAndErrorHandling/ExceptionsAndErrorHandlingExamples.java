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

        try {
            // something that
            // might go wrong
        } catch (Exception e) {
            // handle the error
        }

        // Ex:

        try {
            System.out.println("Let's see...");
            int result = 1/ 0;
            System.out.println("I can divide by zero!");
        } catch (ArithmeticException e) {
            System.out.println("Math still works!");
        }

        // Gives you the output:
            // Let's see...
            //Math still works!




    }
}
