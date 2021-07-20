import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {

    // Adjective = A word or phrase naming an attribute, added to
    // or grammatically related to a noun to modify or describe it.

    // Noun = A word (other than a pronoun) used to identify any of
    // a class of people, places, or things (common noun), or to
    // name a particular one of these (proper noun).

    public static void main(String[] args) {
        GettingRandomElement();
    }

    private static void GettingRandomElement() {
        Random random = new Random();
        String[] adjectives = {"agreeable","anxious","busy"
                ,"blue","comfortable", "curious","distinct"
                ,"excited","hungry","jittery"};
        String[] nouns = {"people","history","art","world","system"
                ,"computer","food","knowledge","power","ability"};

        for (String adjective : adjectives) {
//            System.out.println(adjective);
        }

        for (String noun : nouns) {
//            System.out.println(noun);
        }

//        String RandomAdj = random.

        System.out.println("Here's your server name: " + adjectives[random.nextInt(10)] + " " + nouns[random.nextInt(10)]);

    }

}
