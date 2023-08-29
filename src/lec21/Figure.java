package lec21;

public abstract class Figure {
    final String type;

    protected final double[] sides;

    protected Figure(String type, double[] sides) {
        this.type = type;
        this.sides = sides;
    }

    public abstract double getPerimeter();

    public abstract double getArea();
}
