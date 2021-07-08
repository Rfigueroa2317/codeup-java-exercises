package Shapes;

public class Circle {

    private int radius;

    public Circle(double radius){

    }

//    public double getArea(){
//
//    }

//    public double getCircumference(){
//
//    }
    // **** SHAPES EXERCISE INSTRUCTIONS**** \\
    // *** do this ones instead of the ones in the
    // curriculum *** \\
    //More Shapes
    //Remove the code from the body of your Rectangle and Square classes.
    //Inside of the shapes directory, create a Shape interface with the following method definitions:
    //double getPerimeter();
    //double getArea();
    //Inside of shapes, create an abstract Quadrilateral class that implements Shape. This class should have:
    //protected properties for length and width.
    //a constructor that accepts two doubles for the length and width and sets those properties.
    //methods for getting the length and width.
    //abstract methods for setting the length and width.
    //Change your existing Rectangle class to extend Quadrilateral.
    //Because Quadrilateral implements Shape but does not implement Shape's methods, Rectangle must implement them.
    //Change your existing Square class to extend Quadrilateral.
    //Because the length of all sides of a square are the same, your constructor should only take one 'side' argument.
    //Pass that side along to the super as the length and width: super(side, side)
    //setLength(double side) & setWidth(double side) should set BOTH the super's length and width, as well.
    //Modify your ShapesTest class, use it to:
    //declare a variable of the type Quadrilateral named myShape.
    //ie: Quadrilateral myShape;
    //Test your code by creating instances of both Square and Rectangle and assigning them to myShape so you can display the shape's area and perimeter.
    //This is an example of polymorphism: you can turn myShape into either Square or Rectangle because of the super/sub relationship to Quadrilateral
    //Answer the following questions:
    //Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
    //What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
}
