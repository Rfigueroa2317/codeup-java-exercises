package Warmups;

import java.util.Scanner;

public class WarmupJune29 {
    //    WARMUP
//    TODO: prompt a user to tell us about themselves (age, name, if
//     they have any pets (true/false). Using method overloading, create
//     methods that will return the first fact they told us about
//     themselves. ex: I can input: 18 -- Laura -- false in which case I
//     expect you to return: 18. but if I tell you my name first: Laura --
//     false -- 18. I expect you to return "Laura" ... etc.


    // *** My answer *** \\
    // make sure you work on it and try to solve it \\


//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        return sayHello();
//
//    }
//
//
//    public static void sayHello(String[] s) {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//
//        String userInfo = "Hello there ";
//        System.out.println("hello there " + userInfo);
//    }

    // *** PRACHI'S ANSWER *** \\

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name, age, Do you have pets?");
        String fact1 = scanner.next();
        String fact2 = scanner.next();
        String fact3 = scanner.next();

        System.out.println(getTheFact(fact1));

    }

    private static String getTheFact(String fact1) {
        return fact1;
    }

    private static int getTheFact(int fact1) {
        System.out.println("in method 2");
        return + fact1;
    }

}
