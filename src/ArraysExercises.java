import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercises {

    public static void main(String[] args) {

        // .1 Array Basics

//        int[] numbers = {1,2,3,4,5};
//        System.out.println("The numbers are: " + numbers);
        // running the code like that won't give you the expected
        // outcome. Instead, it will give you a random input
        // of numbers and characters.

//        System.out.println(Arrays.toString(numbers));
        // 'Arrays.toString' is necessary in order to be able
        // to see the actual array.


        // Create an Array that holds 3 person objects.
//
//        String[] Persons = {"Ricardo", "Roxanne", "Ana"};
//        System.out.println(Persons.length);
//        for (int i = 0; i < Person.length; i += 1){
//            System.out.println(Person[i]);
//        }

        // With Enhance method \\
//        for (String Person: Persons) {
//            System.out.println(Person);
//        }

        Person person1 = new Person("Ricardo");
        Person person2 = new Person("Roxanne");
        Person person3 = new Person("Ana");

        String[] persons = {person1.getName(), person2.getName(), person3.getName()};

        for (String person: persons) {
            System.out.println(person);
        }
//        person1.setName("Raul");
//        System.out.println(Arrays.toString(persons));
        Person person4 = new Person("Raul");
        String[] newUpdatedPeople = addPerson(persons, person4);
        System.out.println(Arrays.toString(newUpdatedPeople));
    }

    public static String[] addPerson(String[] people, Person name){
        String[] newArr = Arrays.copyOf(people, people.length + 1);
        newArr[people.length] = name.getName();
        return newArr;
    }

}
