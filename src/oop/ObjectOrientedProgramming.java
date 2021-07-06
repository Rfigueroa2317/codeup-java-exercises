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

// *** Example of a java class *** \\

class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue){
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement){
        speed = speed - decrement;
    }

    void printStates(){
        System.out.println("cadence:" + cadence + "speed: "
                + speed + "gear:" + gear);
    }


}
