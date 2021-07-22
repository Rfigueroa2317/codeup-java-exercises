package Shapes;

public class SquarePractice extends Quadrilateral {
    public SquarePractice(double length, double width) {
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

//    private final int area;
//
//    public SquarePractice(int area) {
//        this.area = area;
//    }
//
//    public int getArea(){
//        return (area * area);
//    }

}
