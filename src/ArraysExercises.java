import java.util.Arrays;
public class ArraysExercises {

    public static void main(String[] args) {

        // .1 Array Basics

        int[] numbers = {1,2,3,4,5};
        System.out.println("The numbers are: " + numbers);
        // running the code like that won't give you the expected
        // outcome. Instead, it will give you a random input
        // of numbers and characters.

        System.out.println(Arrays.toString(numbers));
        // 'Arrays.toString' is necessary in order to be able
        // to see the actual array.


        // Create an Array that holds 3 person objects.

        String[] Persons = {"Ricardo", "Roxanne", "Ana"};
        System.out.println(Persons.length);
//        for (int i = 0; i < Person.length; i += 1){
//            System.out.println(Person[i]);
//        }

        // With Enhance method \\
        for (String Person: Persons) {
            System.out.println(Person);
        }
    }



//    static void addPerson(){
//
//    }

}
