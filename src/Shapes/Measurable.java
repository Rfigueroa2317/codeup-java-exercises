package Shapes;

public interface Measurable {
    double getPerimeter();
    double getArea();

    Measurable myShape = new Measurable() {
        @Override
        public double getPerimeter() {
            return 0;
        }

        @Override
        public double getArea() {
            return 0;
        }
    }

}
