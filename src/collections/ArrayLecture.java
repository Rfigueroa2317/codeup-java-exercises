package collections;

import java.util.Arrays;

public class ArrayLecture {

    public static void main(String[] args) {

//        int[] intArray = new int[3];
//
//        System.out.println(Arrays.toString(intArray));

        System.out.println(Arrays.toString(getIntArray(10))); // "[1,2,3]"

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

    public static int[] getIntArray(){
        return new int[] {1,2,3};
//        int[] intArray = new int [] {1,2,3};
//        return intArray;
        // *** these two give you the same output *** \\
    }

    public static int[] getIntArray(int length){
        int[] intArray = new int[length];

        for (int i = 0; i < intArray.length; i++) {
            intArray[1] = i * 2;
        }
        return intArray;
    }

}
