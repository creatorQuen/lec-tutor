package lec24;

public class Circle extends Figure {
    public Circle(double radius) {
        super(new double[]{radius}, FigureType.CIRCLE);
    }

    @Override
    public double getArea() {
        return 2 * 3.14 * sides[0];
    }

    @Override
    public double getPerimeter() {
        return 3.14 * sides[0] * sides[0];
    }
}
