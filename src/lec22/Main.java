package lec22;

public class Main {
    public static void main(String[] args) {
//        Option option1 = new Option("some description", false);
//        option1 = new Option(option1, true);
//
//        // Figure example.
//        Figure[] figures = new Figure[2];
//        figures[0] = new Circle(2);
//        figures[1] = new Triangle(3, 4, 5);
//
//        for (Figure figure : figures) {
//            print(figure.type + " - area: " + figure.getArea() +
//                    ", perimeter: " + figure.getPerimeter());
//        }

        Figure[] figures = new Figure[3];
        figures[0] = new Circle(2);
        figures[1] = new Rectangle(5,6);
        figures[2] = new Triangle(3,4,5);

        for (Figure figure : figures) {
            print(figure.toString());
        }

    }

    private static void print(String text) {
        System.out.println(text);
    }
}
