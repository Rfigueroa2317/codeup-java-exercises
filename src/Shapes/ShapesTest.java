package Shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Measurable myShape = new SquarePractice(5,5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        // 9. The interface in Measurable is what declares the
        // getPerimeter method. If it's not implemented it wont work

        // 10. When trying to call the getLength and getWidth methods you'll get
        // a 'Cannot resolve symbol'. Both are defined within an Abstract class

        // *** NOT FINISHED *** \\
    }
}
