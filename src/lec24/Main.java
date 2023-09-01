package lec24;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        FigureFactory factory = new FigureFactory();
        Figure figure = factory.create(3, 5);
        showDescription2(figure);

    }

    private static void showDescription2(Figure figure) {
        switch (figure.getType()) {
            case CIRCLE:
                print("this is a circle!");
                break;
            case RECTANGLE:
                print("this is a rectangle!");
                break;
            case TRIANGLE:
                print("this is a triangle!");
                break;
            default:
                print("undefined figure!");
        }
    }

    private static void showDescription(Figure figure) {
        if (figure instanceof Circle) {
            print("this is a circle!");
        } else if (figure instanceof Rectangle) {
            print("this is a rectangle!");
        } else if (figure instanceof Triangle) {
            print("this is a triangle!");
        } else {
            print("undefined figure!");
        }
    }

//    public static void showDescription1(Figure figure) {
//        switch (figure.getType().toLowerCase(Locale.ROOT)) {
//            case "circle":
//                print("this is a circle!");
//                break;
//            case "rectangle":
//                print("this is a rectangle!");
//                break;
//            case "triangle":
//                print("this is a triangle!");
//                break;
//            default:
//                print("undefined figure!");
//        }
//    }

    private static void print(Figure... figures) {
        for (Figure fig : figures) {
            print(fig.toString());
        }
    }

    private static void print(String text) {
        System.out.println(text);
    }

    private static int getDaysForMonth(String month) {
        switch (month.toLowerCase(Locale.ROOT)) {
            case "january":
            case "январь":
                return  31;
            case "february":
                return 28;
            default:
                throw new IllegalArgumentException("not recognized month " + month);
        }
    }

    private static String getDaysForMonth1(String month) {
        int days;
        switch (month.toLowerCase(Locale.ROOT)) {
            case "january":
            case "январь":
                days = 31;
                break;
            case "february":
                days = 28;
                break;
            default:
                days = 0;
        }

        return month + " has " + days + " days.";
    }

    private static String getDaysForMonth2(String month) {
        String result;
        int days = -1;
        switch (month.toLowerCase(Locale.ROOT)) {
            case "january":
            case "январь":
                days = 31;
            case "february":
                days = 28;
            default:
                if (days > 0) {
                    result = month + " has " + days + " days.";
                } else {
                    throw new IllegalArgumentException("invalid month " + month);
                }
        }

        return result;
    }
}
