package Shapes;

abstract class GraphicObject {
    // define member variables - variables that can/will bo used by all
    // subclasses
    // define a shape's starting position using x and y
    //step 4a:
    int x, y;

    // non-abstract (regular) method that can be implemented the same no
    // matter what the subclass is
// step 4b:
    void moveTo(int newX, int newY) {
        System.out.printf("This shape's new coordinates are: %s, %s",
                newX, newY);
    }

    // abstract methods, that can be ued by every subclass of GraphicObject,
    // but will be implemented differently
    // step 4c:
    // draw, resize, fillColor

    abstract void draw();
    abstract void resize();
    abstract void fillColor();
}
