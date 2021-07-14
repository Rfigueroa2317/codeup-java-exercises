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

        int[] numbers = {1,2,3};
        System.out.println(numbers[999]);

        // When the above code is run, an 'ArrayIndexOutOfBounds' exception will be
        // 'thrown' and we'll see the exception message: in this case it is the index
        // that is out of bounds, [999].






    }
}
