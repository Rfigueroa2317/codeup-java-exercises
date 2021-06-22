import java.util.Scanner;
public class HelloWorld {

    public static void main(String[] args){
//        System.out.println("Hello, world!");

        // .1
//        int myFavoriteNumber = 20;
//        System.out.println(myFavoriteNumber);



        // .2
//        var myString = "Music";
//        System.out.println(myString);
        // you can also say 'String' instead of var

        // .3
//        char myString = 'm';
//        System.out.println(myString);

        // .4
//        var myString = 3.14159;
//        System.out.println(myString);

        // .5
//        long myNumber;
//        System.out.println(myNumber);
        // variable myNumber might not have been initialize

        // .6
//        long myNumber = 3.14;
//        System.out.println(myNumber);
        // it has to be a 'double' for the code to run properly
//        long myNumber = (long)3.14; this is the way to write it
        //  for it to run properly

        // .7
//        long myNumber = 123L;
//        System.out.println(myNumber);

        // .8
//        int myNumber = 123;
//        System.out.println(myNumber);
        // I'm seeing the same result. Maybe ask about this during class

        // .9
//        float myNumber = 3.14f;
//        System.out.println(myNumber);
        // leaving it as a number by itself will not let you run it. You will
        //  have to add an 'f' at the end of the number in order for it to work.
        // you can also do float myNumber = (float)3.14; and it'll give you the
        //  same result

        // .10 a
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
        // the first sout is incrementing the int by 1 but not until
        //  you print the number again.
        // the second sout is printing the new value.

        // .10 b
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
        // the first sout is incrementing the int by 1 and showing you
        //  the new value.
        // the second sout is printing the new value.

        // .11
        //  var class;
        // It can't resolve the var.

        // .12
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(three);
        // Initially I thought it was going to run smoothly,
        //  however I wasn't expecting the incompatibility.

//        int three = (int) "three";
        // The differences between the two is that the first one
        // wasn't compatible with java.lang.String. the second one
        // is a straight up error.

        // .13
//        int x = 4;
//        x = x + 5;      x+=5;

//        int x = 3;
//        int y = 4;
//        y = y * x;      y *= x;

//        int x = 10;
//        int y = 2;
//        x = x / y;      x /= y;
//        y = y - x;      y -= x;

        // .14
//        byte num = 127;
//        System.out.println(num + 45);
        // It will not let you assign a numerical value larger
        //  than what it can hold. It will suggest you change it
        //  to the type that can hold that numerical value.

//        int x = Integer.MAX_VALUE;
//        System.out.println(x);

//        String name = "codeup";
//        System.out.printf("Hello there, %s. Nice to see you.\n", name);

//        String greeting = "Salutations";
//        String name = "codeup";
//        System.out.printf("%s, %s!", greeting, name);

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter something: ");
//        String userInput = scanner.nextLine();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
    }

}