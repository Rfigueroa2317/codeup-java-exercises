package Util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString(){
        return "";
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
        if(random <= 10){
        }
        return 9;
    }

    public double getDouble(double min, double max){
        return 5;
    }

    public double getDouble(){
        return 5;
    }


}
