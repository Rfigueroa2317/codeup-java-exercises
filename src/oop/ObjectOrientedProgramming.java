package oop;

public class ObjectOrientedProgramming {

    public static void main(String[] args) {
        // tell me about a person
//        Person person = new Person("Ricardo",30,"5'11","Puertorican");

        Person person = new Person();
        person.setName("Ricardo");
        System.out.println(person.getEntertainment("ride rollercoaster"));

//        String name = person.getName();
        System.out.println(person.getName());
    }

}
