public class SyntaxTypesVariables {

    public static void main(String[] args) {

//        byte myFirstNum = -127;
//        byte mySecondNum = 10;
//        System.out.println(myFirstNum + mySecondNum);
//
//        short myFirstNumber = 32767;
//        short mySecondNumber = 1;
//        System.out.println(myFirstNumber += mySecondNumber);
//
//        float firstNumber = 32.1f;
//        System.out.println(firstNumber);
//
//        double number = 32.14557;
//        System.out.println(number);

//        System.out.println("Hello, my name is Ricardo!");
//        byte myChar = 'd'; //100
//        myChar =+ 'A'; //65
//        System.out.println(myChar);

//        String myName ="Ricardo";
//        System.out.println("Hello " + myName + ", how are you?");

        int temperature = 81;
        var isNiceDay = (temperature > 60) && (temperature < 80);
        if (isNiceDay){
            System.out.println("What a nice day it is");
        }else{
            System.out.println("I don't like it...");
        }
    }


}
