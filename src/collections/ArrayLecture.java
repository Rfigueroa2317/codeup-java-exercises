package collections;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLecture {

    public static void main(String[] args) {

//        int[] intArray = new int[3];
//
//        System.out.println(Arrays.toString(intArray));

//        System.out.println(Arrays.toString(getIntArray(10))); // "[1,2,3]"
        System.out.println(Arrays.toString(getNameArray()));
    }

//    public static int[] getIntArray(int length) {
//        int[] intArray = new int[length];
//
//        int[] intArray = {1,2,3};
//        for (int i = 0; i < intArray.length; i++){
//            intArray[i] = i + 1;
//        }
//
//        return intArray;
//    }

//    public static int[] getIntArray(){
////        return new int[] {1,2,3};
////        int[] intArray = new int [] {1,2,3};
////        return intArray;
//        // *** these two give you the same output *** \\
//    }

//    public static int[] getIntArray(int length){
//        int[] intArray = new int[length];
//
//        for (int i = 0; i < intArray.length; i++) {
//            intArray[1] = i * 2;
//        }
//        return intArray;
//    }

    // TODO: Make a method which returns a String array.
    //  That string array will contain the user's names.
    //  The user's names will be provided by command line input (scanner)
    //  You will need some input trigger that tells a loop to stop
    //  I recommend using a while loop that checks against a variable you set each time the user enters a name and presses 'return'
    //  Finally, call that method in your main() and print out its returned value, as a string
    //  Arrays.toString(yourArray);

    public static String[] getNameArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many names do you want to enter? ");

        int namesLength = scanner.nextInt();
        String[] namesArr = new String[(int)scanner.tokens().count()];

        for (int i = 0; i < (int)scanner.tokens().count(); i++) {
            namesArr[i] = scanner.next();
        }
        return namesArr;
    }

}
