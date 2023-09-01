package lec23;

public class Main {
    public static void main(String[] args) {
        // lec 22
//        Figure[] figures = new Figure[3];
//        figures[0] = new Circle(2);
//        figures[1] = new Rectangle(5,6);
//        figures[2] = new Triangle(3,4,5);
//
//        for (Figure figure : figures) {
//            print(figure.toString());
//        }

//        Figure[] figures = new Figure[3];
//        FigureFactory factory = new FigureFactory();
//        figures[0] = factory.create(new double[]{2});
//        figures[1] = factory.create(new double[]{5,6});
//        figures[2] = factory.create(new double[]{3,4,5});
//
//        for (Figure figure : figures) {
//            print(figure.toString());
//        }

//        Figure[] figures = new Figure[3];
//        FigureFactory factory = new FigureFactory();
//        figures[0] = factory.create(2);
//        figures[1] = factory.create(5,6);
//        figures[2] = factory.create(3,4,5);
//        for (Figure figure : figures) {
//            print(figure.toString());
//        }

        FigureFactory factory = new FigureFactory();
        print(
                factory.create(2),
                factory.create(5,6),
                factory.create(3,4,5)
        );

    }

    private static void print(Figure... figures) {
        for (Figure fig : figures) {
            print(fig.toString());
        }
    }

    private static void print(String text) {
        System.out.println(text);
    }
}
