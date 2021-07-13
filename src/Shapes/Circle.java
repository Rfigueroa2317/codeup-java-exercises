package Shapes;

public class Circle {

    private double radius;
    private double PI = 3.1415;

    public Circle(double radius) {
        this.radius = radius;
        System.out.println("Test");
    }

    public double getArea(){
        double areaOfCircle = ((double) PI * (radius * Math.pow(2,2)));
        System.out.println(areaOfCircle);
        return areaOfCircle;
    }


    public double getCircumference(){
        double CircumferenceOfCircle = ((double) 2 * PI * radius);
        System.out.println(CircumferenceOfCircle);
        return CircumferenceOfCircle;
    }


}
