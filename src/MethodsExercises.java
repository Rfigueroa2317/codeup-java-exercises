import java.util.Scanner;

public class MethodsExercises {

    // 1. Basic Arithmetic. Create four separate methods.
    // Each will perform an arithmetic operation:

    // .a Addition

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Basic Arithmetic:  ");
        int addNumber = scanner.nextInt();
//        Addition(addNumber);
//        Subtraction(addNumber);
//        Multiplication(addNumber);
        Division(addNumber);
    }

//    public static int Addition(int s){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(s);
//        int num1 = scanner.nextInt();
//        System.out.println("Enter first number: " + num1);
//        int num2 = scanner.nextInt();
//        System.out.println("Enter second number: " + num2);
//        int num3 = num1 + num2;
//        System.out.println("Addition of both numbers is: " + num3);
//        return num3;
//    }

    // b. Subtraction

//    public static int Subtraction(int s){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(s);
//        int num1 = scanner.nextInt();
//        System.out.println("Enter first number: " + num1);
//        int num2 = scanner.nextInt();
//        System.out.println("Enter second number: " + num2);
//        int num3 = num1 - num2;
//        System.out.println("Subtraction of both numbers is: " + num3);
//        return num3;
//    }

//    public static int Multiplication(int s){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(s);
//        int num1 = scanner.nextInt();
//        System.out.println("Enter first number: " + num1);
//        int num2 = scanner.nextInt();
//        System.out.println("Enter second number: " + num2);
//        int num3 = num1 * num2;
//        System.out.println("The multiplication of both numbers is: " + num3);
//        return num3;
//    }

    public static int Division(int s){
        Scanner scanner = new Scanner(System.in);
        System.out.println(s);
        int num1 = scanner.nextInt();
        System.out.println("Enter first number: " + num1);
        int num2 = scanner.nextInt();
        System.out.println("Enter second number: " + num2);
        int num3 = num1 / num2;
        System.out.println("The division of both numbers is: " + num3);
        return num3;
    }
}

// function addTwoNumbers(param1, param2){
// /* code goes here */
// let sum = param1 + param2;
// return sum;
//}

//addTwoNumbers(8, 2); // execute the function in js
