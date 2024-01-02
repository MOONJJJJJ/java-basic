package oop1.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {
//        int width = 5;
//        int height = 8;
//        int area = calculateArea(width, height);
//        System.out.println("넓이: " + area);

        Rectangle rectangle = new Rectangle();
        rectangle.height=8;
        rectangle.width=5;
        int area = rectangle.calculateArea();
        System.out.println("넓이: " + area);
        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);
        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부: " + square);

//        int perimeter = calculatePerimeter(width, height);
//        System.out.println("둘레 길이: " + perimeter);
//
//        boolean square = isSquare(width, height);
//        System.out.println("정사각형 여부: " + square);
    }

//    static int calculateArea(int width, int height) {
//        return width * height;
//    }

    static int calculatePerimeter(int width, int height) {
        return 2 * (width + height);
    }

    static boolean isSquare(int width, int height) {
        return width == height;
    }

}