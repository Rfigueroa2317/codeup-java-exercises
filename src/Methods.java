import java.util.Scanner;
public class Methods {


//    Different types of methods

//    main

//    public static void main(String[] args) {
//        System.out.println("hello world");
//
//        System.out.println(greeting("twenty-four")); //24
//
//        return; // acts like a break;
//
//    }
//
//    public static int greeting(String age){
//        System.out.println("age: " + age);
//        int indexOfR = age.indexOf('r');
//        return indexOfR;
//    }

//    syntax
//    public - whether - how visible your method is to other classes.
//    static - available for this class and not an instance of a class
//    void   - define what the data type is of what's being returned
//              (if anything is being returned)
//    main, nameOfTheMethod - name of the method - you come up with that
//    (dataType parameters) - parameters go in the parenthesis within
//              the data type defined
//    {/* your code /code block goes here * (/ }

//    1) it for sure is going to have a return statement
//    2) it's going to expect the return to actually return a String
//    data type
//    public static String greeting(){
//        return "hello world";
//    }


//    TODO: create a new method that accepts the name of a basketball
//     team (ex: the spurs) and returns a String that says
//     "[basketballTeam] is the best team.". Invoke that method within
//     your main method (remember to pass in the name of the basketball
//     team). print out the result of the new method.

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter a team name: ");
//        String ballTeam = sc.nextLine();
//        BasketballTeam(ballTeam);
//    }
//
//    public static void BasketballTeam(String s){
//
//        String team = s + " are the best team. ";
//        System.out.println(team);
//    }

//     TODO: create a new method that accepts the string created from the
//      first method and returns the number of characters in that string.


//    Method overloading

    public static void main(String[] args) {
//        greeting("wassup");
//        System.out.println(greeting("hello","hey",));
    }

//    public static void greeting(String newGreeting){
//        System.out.println(newGreeting);
//    }

    public static void greeting(){
        System.out.println("hello world");
    }

    public static void greeting(String oneGreeting){
        System.out.println(oneGreeting);
    }

    public static void greeting(int randomNum){
        System.out.println(randomNum);
    }

//    you cannot have two separate methods with 'int' in it.
//    you cannot repeat the same expectations
//    public static void greeting(int anotherNum){
//        System.out.println(randomNum);
//    }

    public static void greeting(char letter){
        System.out.println(letter);
    }


//    public static void greeting(char first, char second, char third){
//        int sum = first + second + third;
//    }

//    TODO: invoke a method that accepts (and returns) the following:
//        - accepts: your first name and your last name. returns: A
//        string that reads: "Hello Laura Ruiz-Roehrs (replace with your
//        first and last)";


    public static void FirstAndLast(){

    }

}


