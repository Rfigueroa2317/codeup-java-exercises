package ExceptionsAndErrorHandling;

import java.util.Scanner;

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

//        int[] numbers = {1,2,3};
//        int x;
//
//        try {
//            x = numbers[100];
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Caught an array index exception!");
//        } catch (Exception e) {
//            System.out.println("Caught a generic exception!");
//        } finally {
//            System.out.println("This will always run.");
//        }

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

        // Exceptions are divided into two main categories: 'checked' and 'unchecked'.
        // These are mostly exceptions that are built into the Java language, and do
        // not need to be explicitly dealt with.

        // In contrast to unchecked exceptions are checked exceptions. Checked
        // exceptions must be handled in our code, either with a try-catch, or
        // by declaring them in the method signature with the 'throws' keyword.
        // Checked exceptions are enforced by the compiler, meaning that if a
        // checked exception is not handled, the code will not compile.

        // There exist a third category as well, 'Error'. errors represent something
        // going very wrong, usually this is not something that we can anticipate or
        // handle in our code.

        // Some of the three main base classes:

        // Exception
        //  .Errors our code should prepare for.
        //  .Generally, any custom exceptions we create will subclass 'Exception'.
        //  .For example: 'FileNotFoundException', or 'SQLException'.

        // RuntimeException
        //  .Things that can go wrong, but that we can usually prevent programmatically
        //  .'ArrayIndexOutOfBoundsException','NullPointerException', and 'IllegalArgumentException'
        //      are all examples of runtime exceptions.

        // Error
        //  .A serious problem.
        //  .Usually occurs at the OS or JVM level.
        //  .'OutOfMemoryError', or'StackOverflowError'.


        // *** Working with Checked Exceptions *** \\

        // To illustrate how checked exceptions work, let's take a look at a
        // small sample application that prompts users for their indentation
        // preferences. This code will raise an exception if something drastic
        // occurs (the user prefers the wrong type of indentation).

        // *** THIS EXAMPLE HAS TO BE OUTSIDE OF THE MAIN METHOD FOR IT TO WORK *** \\
//        public static String getIndentationPreference() throws Exception {
//            Scanner sc = new Scanner(System.in);
//            System.out.print("What type of indentation do you prefer?");
//            String indentationPreference = sc.nextLine();
//
//            if(indentationPreference.equals("tabs")) {
//                throw new Exception("Spaces are superior!");
//            }
//
//            return indentationPreference;
//        }

        // Notice that, in addition to the method signature we are already
        // familiar with, we've added 'throws Exception' to the method definition.
        // This is one way to handle a checked exception.

        // If a method contains a line of code that can cause an exception to be thrown
        // (including an explicit 'throw' statement), the line must either be inside
        // of a try-catch, or the exception must be added to the method's signature
        // using 'throws'.

        // Ex:

        //inside main method***\\
//        String indentationPreference;

//        try {
//            indentationPreference = getIndentationPreference();
//            System.out.println("Okay, " + indentationPreference + " is a great choice.");
//        } catch (Exception e) {
//            System.out.println("Uh oh, something went");
//            System.out.println("Here is some more detail:");
//            e.printStackTrace();
//        }

        // Adding the exception to the method signature
//        indentationPreference = getIndentationPreference();
//        System.out.println("Okay " + indentationPreference + " is a great choice.");

        // Notice that using an explicit try-catch allows us more control over
        // how the error is handled. Using 'throws' indicates that the error
        // handing is the responsibility of the code calling the method.


        // *** Custon Exceptions *** \\

        // In addition to the built-in exceptions in the Java language, we can
        // create our own application-specific exceptions by extending the 'Exception'
        // class. By convention, these classes are suffixed with 'Exception'. To
        // illustrate, we can define a custom exception type for our previous example:

//        class WrongIndentationTypeException extends Exception {}
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What type of indentation do you prefer?");
//        String indentationPreference = scanner.nextLine();
//
//        if(indentationPreference.equals("tabs")) {
//            WrongIndentationTypeException e;
//            e = new WrongIndentationTypeException("Spaces are superior!");
//            throw e;
//        }

        // Because exceptions are just objects, we can store them in a variable,
        // declare, and initialize them just like any other object.


        // ** Good Error Messages ** \\
        // In general, exception messages should be helpful and descriptive
        // of the problem that caused the exception, unlike the example above.
        // A better message might look like:

        // Error when getting user indentation preference.
        // Input was "tabs", was expecting "spaces".

        // It is very common to see custom exception classes that extend from
        // Exception, but don't provide any additional functionality over the
        // base 'Exception' class. This is done simply as a tool to express in
        // code that there are errors specific to our application that we wish
        // to treat differently than other, more general exceptions.


        // ** Exceptions Best Practices ** \\
        // Most likely you will be handling existing exceptions in the language
        // than creating your own, so this previous section it's more about exposure.

        // Remember to write clear sentences and include ending punctuation. Each
        // sentence in the String assigned to the exception message should end in
        // a period. For example, "The log table has overflowed." would be an
        // appropriate message string.



        // *** fin *** \\

    }

    private static String getIndentationPreference() {
        return "";
    }

}
