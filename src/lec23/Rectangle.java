package lec23;

public class Rectangle extends Figure {

    public Rectangle(double a, double b) {
        super(new double[]{a, b});
    }


    @Override
    public double getArea() {
        return sides[0] * sides[1];
    }

    @Override
    protected String getType() {
        return "Прямоугольник";
    }

    @Override
    public double getPerimeter() {
        return 2 * super.getPerimeter();
    }

    @Override
    public String toString() {
        return  getType() + " " + "площадь: " + getArea();
    }
}
