package Util;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();
        boolean userInput = input.yesNo("yes");
        System.out.println(userInput);

        System.out.println(input.getInt(0, 10));
        input.setUserInput();

        System.out.println(input.getDouble(0, 10));
        input.getDouble();
    }



}
