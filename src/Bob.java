import java.util.Locale;
import java.util.Scanner;

/*
TODO: Create a class named Bob with a main method for the following exercise.

Bob is a lackadaisical teenager. In conversation, his responses are very limited.

Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
He answers 'Whatever.' to anything else.
Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
 */


public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String answer1 = "Sure."; // input ends with a question mark
//        String answer2 = "Whoa chill out!"; // input ends with an exclamation mark
//        String answer3 = "Fine. Be that way!"; // empty input (" ");
//        String answer4 = "Whatever."; // to anything else
//        System.out.println("");
//        String input = sc.next();

        System.out.println("Hey Bob how you doing?");
        String input = sc.next();

        if(input.isEmpty()){
            System.out.println("Fine. Be that way!");
        }else if(input.endsWith("?")){
            System.out.println("Sure.");
        }else if(input.endsWith("!")){
            System.out.println("Whoa chill out!");
        }else{
            System.out.println("Whatever");
        }


    }
}
