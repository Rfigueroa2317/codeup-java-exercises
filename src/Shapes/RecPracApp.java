package Shapes;

import Util.Input;

import java.util.Scanner;

public class RecPracApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Input in = new Input();
        int getArea = Input.RectanglePractice();

        int length = scanner.nextInt();
        int width = scanner.nextInt();

        int area = length * width;

//        RectanglePractice rectanglePractice = new RectanglePractice(area);
//
//        System.out.println("The area of the rectangle is: " + rectanglePractice.area);




    }

}
