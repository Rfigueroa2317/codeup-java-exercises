public class HelloWorld {

    public static void main(String[] args){
//        System.out.println("Hello, world!");

        // .1
//        int myFavoriteNumber = 20;
//        System.out.println(myFavoriteNumber);

        // .2
//        var myString = "Music";
//        System.out.println(myString);

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
        // it has to be a 'double' for the code to run properly

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
        // It can't resolve the var

        // .12
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
        // Initially I thought it was going to run smoothly,
        //  however I wasn't expecting the incompatibility.

//        int three = (int) "three";
        // The differences between the two is that the first one
        // wasn't compatible with java.lang.String. the second one
        // is a straight up error.

        // .13
        int x = 4;
        x = x + 5;
        System.out.println();
    }
}