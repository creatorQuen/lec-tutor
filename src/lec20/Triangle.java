package lec20;

public class Triangle {
    private final int sideA;
    private final int sideB;
    private final int sideC;

    public Triangle(Point a, Point b, Point c) {
//        int sideA = a.getDistanceTo(b);
//        int sideB = a.getDistanceTo(c);
//        int sideC = b.getDistanceTo(c);

//        this.sideA = sideA;
//        this.sideB = sideB;
//        this.sideC = sideC;
        //Triangle(sideA, sideB, sideC); - method call excepted.
        this(a.getDistanceTo(b), a.getDistanceTo(c), b.getDistanceTo(c));
    }

    public Triangle(int sideA, int sideB, int sideC) {
        if (sideA + sideB > sideC &&
                sideA + sideC > sideB &&
                sideB + sideC > sideA) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else
            throw new IllegalArgumentException("Invalid arguments " + sideA + ", " + sideB + ", " + sideC);
    }

    public boolean isRightTriangle() {
        return this.sideA * this.sideA + this.sideB * this.sideB == this.sideC * this.sideC ||
                this.sideA * this.sideA + this.sideC * this.sideC == this.sideB * this.sideB ||
                this.sideC * this.sideC + this.sideB * this.sideB == this.sideA * this.sideA;
    }
}
