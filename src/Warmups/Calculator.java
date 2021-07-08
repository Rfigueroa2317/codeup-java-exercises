package Warmups; //Morning Warmup 7/8/21

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        CalculatorApp();
    }

    public static void CalculatorApp() {

        int num1 = 0;
        int num2 = 0;
        char operator;
        double answer = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        num1 = scanner.nextInt();
        System.out.println("What operation? ");
        operator = scanner.next().charAt(0);
        System.out.println("Please enter second number: ");
        num2 = scanner.nextInt();
        switch (operator) {
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num1 - num2;
                break;
            case '*':
                answer = num1 * num2;
                break;
            case '/':
                answer = num1 / num2;
                break;
        }
        System.out.println(num1 + " " + operator + " " + " " + num2 + " = " + answer);
    }

}
