package Shapes;


import Util.Input;

public class CircleApp {
    public static void main(String[] args) {

        Input in = new Input();
        int radius = in.getRadius();

        Circle circle = new Circle(radius);
        System.out.println("The area of the circle is: " + circle.getArea());

        System.out.println("The circumference of the circle is: " + circle.getCircumference());
    }

}
