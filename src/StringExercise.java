import java.util.Locale;
import java.util.Scanner;


public class StringExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // .1

        String message = "We don't need no education. ";
        message = message + "We don't need no thought control";
        System.out.println(message);

        System.out.println("Check 'this' out!, " + message + " inside of " + message + "s!");

        message = "In windows, the main drive is usually C:\\";
        System.out.println(message);

        message = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!";
        System.out.println(message);

        // for backslash in Java:
        // When wanting (or needing) to do backslash do double of the one
        //  you need: ex. for '\', do '\\'. if it's \\, do '\\\\',
        //  and for '\\\', do '\\\\\\';


    }
}
