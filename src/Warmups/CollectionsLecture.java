package Warmups;

import oop.Person;

import java.util.ArrayList;

public class CollectionsLecture {

    public static void main(String[] args) {

        ArrayList<String> stringArr = new ArrayList<>(), stringArrCopy = new ArrayList<>();

        stringArr.add("Ricardo");

        System.out.println(stringArr);
        System.out.printf("Current ArrayList size: %s", stringArr.size());
        System.out.println(stringArr);
        System.out.println(stringArr.hashCode());

        stringArr.add("Ricardo");
        System.out.printf("Current ArrayList size: %s\n", stringArr.size());
        System.out.println(stringArr.get(0));
        System.out.println(stringArr);
        System.out.println(stringArr.hashCode());

        // Remove second element
//        stringArr.remove(1);
//        System.out.println(System.identityHashCode(stringArr));

        ArrayList<String> stringArrayCopy = stringArr;

        System.out.println("Array list copy: ");
        System.out.println(stringArrayCopy);
        System.out.println("Copied list hascode: ");
        System.out.println(System.identityHashCode(stringArrayCopy));
        System.out.println("\n");

        stringArrayCopy.remove(1);
        System.out.println(stringArr);

        System.out.println("The array list are equal: " + stringArr.equals(stringArrayCopy));

        ArrayList<Person> peopleList = new ArrayList<>();

//        peopleList.add(new Person("Ricardo Figueroa"));
//
//        for(Person person: peopleList){
//            PersonUtils.printGreeting("Hello, I am: ", person.getFullName());
//        }



    }
}
