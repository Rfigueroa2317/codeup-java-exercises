package Util;

public class InputTest {

    public static void main(String[] args) {
//        Input input = new Input();
//        boolean userInput = input.yesNo("yes");
//        System.out.println(userInput);
//
//        System.out.println(input.getInt(0, 10));
//        input.setUserInput();
//
//        System.out.println(input.getDouble(0, 10));
//        input.getDouble();
//
//        System.out.println();
//        input.

//        input.Circle();
        playMinMax();

    }

    public static void playMinMax() {
        Input input = new Input();
//        System.out.println(input.getInt(input.getString()));
//        System.out.println(input.getDouble(input.getString()));
        double min = input.getDouble(input.getString());
        System.out.println("This is your min: " + min);
        double max = input.getDouble(input.getString());
        System.out.println("This is your max: " + max);
        Double myDouble = input.getDouble(min, max);
        System.out.println("This was the random number: " + myDouble);

    }

}
