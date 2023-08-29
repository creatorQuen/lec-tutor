package lec19;

public class Main {
    public static void main(String[] args) {
        boolean valid = Triangle.areValidArguments(3, 4, 5);
        if (valid) {
            Triangle triangle = new Triangle(3, 4, 5);
            System.out.println(triangle.isRightTriangle());
        }
    }
}
