import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

public class StringsLecture {


    public class Strings {
        //        warmup:
//        TODO: create a new "Strings-Lecture" java class file (or wherever
//         you like to keep notes/lecture exercises. Copy given
//         code, that is your starting point. Using Scanner prompt a
//         user (in this case it's you, you're the user) to type in
//         their first name. Save the input into a String variable. If
//         your name matches randomName, print "woah! you guessed:
//         enter-randomName-here! How did you know enter-yourName-here
//         is my name?!". if randomName does
//         not
//         match your name exactly, print "Way off my friend! My name
//         isn't randomName-here. It's yourName-here.".
    }


    //        import java.util.Scanner;
//        public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String[] studentsArr =
//                {"Amado", "Christian", "Christopher", "Corey", "Demetrio",
//                        "Diamond", "Erik", "Grady", "Jesse", "Joshua",
//                        "Juan", "Mitchell", "Moses", "Nathan", "Prachi",
//                        "Raul", "Ricardo", "Richard", "Robert", "Sam",
//                        "Sean", "Stephen", "Tiffanny", "Wagner", "Laura",
//                        "Casey", "Dorian", "Tristan", "Jordy"};
//        int randomNum = (int) (Math.random() * 28);
//        String randomName = studentsArr[randomNum];
//        /* your code goes here */
//
//        System.out.println("What is your first name?");
//        String firstName = sc.next();
//        System.out.printf("You entered: ", firstName);
//        if(firstName.equals(randomName)){
//            System.out.println("woah! you guessed enter-randomName-here: " + randomName);
//        }else{
//            System.out.println("sorry, wrong name " + randomName );
//        }

        // Intro to Strings \\

//        String: a non-primitive data type, refer to an object
//        String msg = "hello";
//        System.out.println(msg);
//        msg = msg + ", how are you?";
//        System.out.println(msg);

//        ex:
//        Str msg = "hi";
//        msg = msg + "Hi, how are you?";
//        obj1 is: "hi";
//        obj2 is: "Hi, how are you?;

//        String Comparison
//        --> return true or false
//        syntax: couchYou'reComparingTo
//        .equals()
//        System.out.println("do you like Pizza? [y/n]? ");
//        String userInput = sc.next();
//        System.out.println(userInput);
//        if(userInput.equals("y")){
//            System.out.println("yes I like pizza");
//        }else{
//            System.out.println("no pizza for me. I'm crazy");
//        }

//        .equalsIgnoreCase()
//        System.out.println("What's your name");
//        String userInput = sc.next();
//        System.out.println(userInput);
//        if(userInput.equals("Ricardo")){
//            System.out.println("yes that's my name exactly");
//        }else if (userInput.equalsIgnoreCase("ricardo")){
//            System.out.println("That's my name but you for to " + "capitalize a letter");
//        }else{
//            System.out.println("that's not my name!");
//        }

//        .startsWith() : compare the first word and see if it is a match, case-sensitive
//        String myFaveBand = "The Used";
//        System.out.println(myFaveBand.startsWith("the")); // false
//        System.out.println(myFaveBand.startsWith("The")); // true


//        .endsWith() - compare the last word in the original String, case-sensitive
//        String myFaveBand = "The Used";
//        System.out.println(myFaveBand.endsWith("Used")); // false

//

//        TODO: create a String variable that holds this sentence: "Red
//         Orange Blue Yellow Green Purple". Prompt the user to type in
//         their favorite color, if their fave color is the same as the
//         first word in the String, then print out "my fave color:
//         userColor is the first one". If their fave color is last,
//         then print out "my fave color: userColor is last"


//        String sentence = "Red Orange Blue Yellow Green Purple";
//        System.out.println("What's your favorite color?");
//        String userInput = sc.nextLine();
//        if(userInput.equalsIgnoreCase("Red")){
//            System.out.println("my fave color is the first one");
//        }else if(userInput.equalsIgnoreCase("Purple")){
//            System.out.println("my fave color: userColor is last");
//        }else{
//            System.out.println("That color is in the middle");
//        }


//        String Manipulation Methods

//        charAt(): return index of a specified character, return an
//        int, save what's being returned in an int variable. return
//        char that's living in the slot of the index you provide. gotta
//        save the returned value in a char variable. pass in an int-
//        String myFaveWord = "hemoglobin";
////        System.out.println(myFaveWord.charAt(4));
//        char fourth = myFaveWord.charAt(4);
//        System.out.println(fourth);


//      indexOf(): return the index of a substring that's being passed in,
//                  if that substring(char) doesn't exist, you'll see a
//                  -1;

//        String earthFact = "Seventy percent of the oxygen on Earth comes from" +
//                "ocean algae";
//        System.out.println(earthFact.indexOf('l'));


//        lastIndexOf(): return the index (int) from the end of the
//        string,
//        String scuba = "self contained underwater breathing apparatus";
//        char letter = 'c';
//        System.out.println(scuba.lastIndexOf('s'));
//        String word = "underwater";
//        System.out.println(scuba.lastIndexOf(word));


//        length();
//        String superCali = "Supersentence";
//        System.out.println(superCali.length());


//        replace(): return a copy of the string with the replacement
//        String before = "giggles ";
//        String after = before.replace('i','o');
//        System.out.println("Typo alert! you can't switch with: " + before +
//                "but you can switch with: " + after);


//        substring(): return a new substring from the original string
//              at the points in which you told it to extract from
//        String danceArms = "Where are you supposed to put your arms when" +
//                " you dance? It's like the universal " + "question.";
//        int indexArms = danceArms.indexOf("arms");
//        int indexQuestion = danceArms.indexOf('?');
//        String newSentence = danceArms.substring(indexArms, indexQuestion);
//        System.out.println(newSentence);


//        toLowerCase();
        String coders = "The distance between looking like a genius " +
                "and looking like an idiot in " +
                "programming? It's one Character " +
                "wide.";
        System.out.println(coders);
        System.out.println(coders.toLowerCase());



//        toUpperCase():

        System.out.println(coders.toUpperCase());


//        trim():
        System.out.println("give me some space: ");
        String userInput = sc.next();
        System.out.println(userInput);
        System.out.println(userInput.trim());



    }

}


