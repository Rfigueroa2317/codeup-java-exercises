import java.util.Scanner;


public class HighLow {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HighLowGame();
    }


//    public static int HighLowGame(){
//        Scanner scanner = new Scanner(System.in);
//
//        int number = (int)(1 + Math.random() * 100);
//        System.out.println("Guess a number between 1 and 100: ");
//
//        int guesses = 0;
//        boolean done = false;
//
//        while(!done){
//            int playerGuess = scanner.nextInt();
//            guesses++;
//
//            if(number < playerGuess){
//                System.out.println("Number is lower than " + playerGuess + ".");
//                System.out.println("Wrong! Try again! (Type a number and press enter.)");
//            }else if(number > playerGuess){
//                System.out.println("Number is higher than " + playerGuess + ".");
//                System.out.println("Wrong! Try again! (Type a number and press enter.)");
//            }else{
//                System.out.println("CORRECT! I was thinking of " + number + ".");
//                System.out.println("It took you " + guesses + " guesses to get it right. Thanks for playing!");
//                done = true;
//            }
//        }
//        return 0;
//    }

    // FOR LOOP METHOD \\


    public static int HighLowGame(){
        Scanner scanner = new Scanner(System.in);
        int number = (int)(1 + Math.random() * 100);
        System.out.println("Guess a number between 1 and 100:");


        int guesses = 0;
        int numGuessed = 0;
        boolean done = false;

        for(int i = 0; i < guesses; i++){
            int playerGuess = scanner.nextInt();

        }done = true;

        return 0;
    }


}
