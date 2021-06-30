import java.util.Scanner;

public class MethodsExercises {

    // 1. Basic Arithmetic.

    // .a Create four separate methods.
    // Each will perform an arithmetic operation:


//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" Basic Arithmetic:  ");
//        int addNumber = scanner.nextInt();
////        Addition(addNumber);
////        Subtraction(addNumber);
////        Multiplication(addNumber);
////        Division(addNumber);
////        Modulus(addNumber);
//    }

    // Addition

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

    // Subtraction

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

    // Multiplication

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

    // Division

//    public static int Division(int s){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(s);
//        int num1 = scanner.nextInt();
//        System.out.println("Enter first number: " + num1);
//        int num2 = scanner.nextInt();
//        System.out.println("Enter second number: " + num2);
//        int num3 = num1 / num2;
//        System.out.println("The division of both numbers is: " + num3);
//        return num3;
//    }

    // d. Modulus

//    public static int Modulus(int s) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(s);
//        int num1 = scanner.nextInt();
//        System.out.println("Enter first number: " + num1);
//        int num2 = scanner.nextInt();
//        System.out.println("Enter second number: " + num2);
//        int num3 = num1 % num2;
//        System.out.println("The remainder of both numbers is: " + num3);
//        return num3;
//
//    }

    // *** Easier way of doing it *** \\

    public static void main(String[] args) {
        add(5, 5);
        subtract(4, 4);
        multiply(8, 8);
        divide(3,3);
        modulus(7, 5);
    }
    public static void add(int a, int b){
        System.out.println(a * b);
    }

    public static void subtract(int a, int b){
        System.out.println(a - b);
    }
    public static void multiply(int a, int b){
        System.out.println(a * b);
    }
    public static void divide(int a, int b){
        System.out.println(a / b);
    }
    public static void modulus(int a, int b){
        System.out.println(a % b);
    }



    // .2 Create a method that validates that user input is in a certain range

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//    }
//
//        public static int getInteger(int min, int max){
//        int userInput = getInteger(1, 10);
//        return getInteger();
//        }



















}

// function addTwoNumbers(param1, param2){
// /* code goes here */
// let sum = param1 + param2;
// return sum;
//}

//addTwoNumbers(8, 2); // execute the function in js
