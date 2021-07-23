package Shapes;


public class RectanglePractice extends Quadrilateral implements Measurable {
    public RectanglePractice(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }


    // A = l * w

//    public final int area;
//
//
//    public RectanglePractice(int area) {
//        this.area = area;
//    }


}
