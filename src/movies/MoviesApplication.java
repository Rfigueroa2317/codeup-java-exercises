package movies;
import movies.MoviesArray;
import movies.Movie;
import Util.Input;


import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
    MoviesApplication moviesApplication = new MoviesApplication();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Search for a movie: ");
        System.out.println("1. view all movies. \n" +
                "2. View movies in the animated category. \n" +
                "3. view movies in the drama category. \n" +
                "4. view movies in the horror category. \n" +
                "5. view movies in the scifi category. \n"
                + "Enter your choice: ");
        String userInput = scanner.next();
        switch (userInput){
            case "1":
               MoviesArray movies = new MoviesArray();
                for (int i = 0; i < MoviesArray.findAll().length; i++) {
                    System.out.println(MoviesArray.findAll().length);
                }
            case "2":

        }

//        MoviesArray moviesArray = new MoviesArray();


    }

}
