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
        boolean Menu = true;
        do {
            System.out.println("Search for a movie: ");
            System.out.println("0. exit \n" + "1. view all movies. \n" +
                    "2. View movies in the animated category. \n" +
                    "3. view movies in the drama category. \n" +
                    "4. view movies in the horror category. \n" +
                    "5. view movies in the scifi category. \n"
                    + "Enter your choice: ");
            String userInput = scanner.next();
            Movie[] movies = MoviesArray.findAll();

            switch (userInput) {
                case "0":
                    System.out.println("Have a good day!");
                    break;
                case "1":
                    for (Movie movie : movies) {
                        System.out.println(movie.getName() + " - " + movie.getCategory());
                    }
                    break;
                case "2":
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("animated")) {
                            System.out.println(movie.getName() + " - " + movie.getCategory());

                        }
                    }
                    break;
                case "3":
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("drama")) {
                            System.out.println(movie.getName() + " - " + movie.getCategory());
                        }
                    }
                    break;
                case "4":
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("horror")) {
                            System.out.println(movie.getName() + " - " + movie.getCategory());
                        }
                    }
                    break;
                case "5":
                    for (Movie movie : movies) {
                        if (movie.getCategory().equals("scifi")) {
                            System.out.println(movie.getName() + " - " + movie.getCategory());
                        }
                    }
                    break;
            }

        } while (Menu);
    }

}
