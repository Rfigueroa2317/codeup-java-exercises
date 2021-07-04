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

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        add(0,0);
//        subtract(0, 0);
//        multiply(0, 0);
//        divide(1,1);
//        modulus(1, 1);
//    }
//    public static void add(int a, int b){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("do the addition: ");
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        System.out.println(a + b);
//        System.out.println(num1 + num2);
//    }
//
//    public static void subtract(int a, int b){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("do the subtraction: ");
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        System.out.println(a - b);
//        System.out.println(num1 - num2);
//
//    }
//    public static void multiply(int a, int b){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("do the multiplication: ");
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        System.out.println(a * b);
//        System.out.println(num1 * num2);
//
//    }
//    public static void divide(int a, int b){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("do the division: ");
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        System.out.println(a / b);
//        System.out.println(num1 / num2);
//
//    }
//    public static void modulus(int a, int b){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("do the modulus: ");
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        System.out.println(a % b);
//        System.out.println(num1 % num2);
//
//    }



    // .2 Create a method that validates that user input is in a certain range

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number between 1 and 10: ");
//        int range = scanner.nextInt();
//        getInteger(1, 10);
//    }
////
////
//    public static int getInteger(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
////        int userInput = getInteger(1, 10);
//        if(min == 0){
//            System.out.println("All Done!");
//        }else{
//            System.out.println(min);
////            getInteger(1, 10);
//
//        }
//        return max--;
//    }

    // .2 *** Casey's solution (and another way of doing it) *** \\

//    public static void main(String[] args) {
//       int validInput = getInteger(1,10, new Scanner(System.in));
//
//        System.out.printf("You entered a valid number: %s", validInput);
//    }
//
//
//    public static int getInteger(int min, int max, Scanner scanner){
//
//        int userInput = 0;
//
//        System.out.printf("Please enter a number between %s and %s");
//        Scanner scanner = new Scanner(System.in);
//
//        userInput = scanner.nextInt();
//
//        if(userInput > max || userInput < min){
//            getInteger(min, max);
//        }
//
//        return userInput;
//    }


    // .3 Calculate the factorial of a number.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FactorialNumber();

    }

    public static long FactorialNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer from 1 to 10: ");
        int input = scanner.nextInt();
        long number = 1;
        for (int i = 1; i <= input; i++){
            number = number * i;
        }
        System.out.println("The Factorial of " + input + " is: " + number);

        return input;
        // *** needs factorial table *** \\

    }



    // *** use this to help you out for #3 \\

//    public static long getFactorial(int num) {
//        if (num >= 1)
//            return num * getFactorial(num - 1);
//        else
//            return 1;
//    }


// 4. Create an application that simulates dice rolling.


}

// function addTwoNumbers(param1, param2){
// /* code goes here */
// let sum = param1 + param2;
// return sum;
//}

//addTwoNumbers(8, 2); // execute the function in js
