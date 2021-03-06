package Util;

import movies.MoviesApplication;

import java.util.Scanner;


public class Input {

    private static Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public void setUserInput(){
        System.out.println("enter a number: ");
        String userInput = scanner.nextLine();
        System.out.println("user entered: " + userInput);
    }

    public String getString(){
        System.out.println("Please enter a number: ");
        return scanner.nextLine();
    }

    public boolean yesNo(String userInput){
        if(userInput.equals("y") || (userInput.equals("yes")) ){
            return true;
        }else{
            return false;
        }

    }

    public int getInt(int min, int max){
        int random = (int) Math.floor(Math.random() * 100);
        System.out.println(random);
        if(random >= min && random <= max){
            return random;
        }
        return -1;
    }

    public int getInt(String input){
        try {
            return Integer.valueOf(input);
        } catch (NumberFormatException e){
            System.out.println("This wasn't a valid input: " + input);
            return getInt(getString());
        }
    }



    public double getDouble(double min, double max){
        double random =(double) Math.floor(Math.random() * 100);
        System.out.println(random);
        if(random >= min && random <= max){
            return random;
        }
        return -1;
    }

    public double getDouble(){
        double random =(double) Math.floor(Math.random() * 100);
        System.out.println(random);
        if(random >= 10){
            return random;
        }
        return -1;
    }

    public double getDouble(String input){
       try{
           return Double.valueOf(input);
       } catch (NumberFormatException e){
           System.out.println("This wasn't a valid double: " + input);
           return getDouble(getString());
       }

    }

   public static int getRadius(){
       System.out.println("enter radius: ");
       return scanner.nextInt();
   }

   public static int RectanglePractice(){
       System.out.println("enter length: ");
       System.out.println("enter width: ");
       return scanner.nextInt();
   }

   public static int SquarePractice(){
       System.out.println("Please enter a value: ");
       return scanner.nextInt();
   }

   public static String MoviesApplication(){
       MoviesApplication moviesApplication = new MoviesApplication();
       return "Movies";
   }


    public boolean yesNo() {
        return true;
    }
}
