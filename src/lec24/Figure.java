package lec24;

public abstract class Figure {

    private final FigureType type;

    protected final double[] sides;

    protected Figure(double[] sides, FigureType type) {
        this.type = type;
        this.sides = sides;
    }

//    protected String getType() {
//        return getClass().getSimpleName();
//    }

    public FigureType getType() {
        return type;
    }

    public abstract double getArea();

    protected double getPerimeter() {
        double perimeter = 0;
        for (double side : sides) {
            perimeter += side;
        }
        return perimeter;
    };

    @Override
    public String toString() {
        return getType() + " - area: " + getArea() +
                ", perimeter: " + getPerimeter();
    }
}
