package ru.stqa.geometry.figures;

public record Rectangle(double a, double b) {

    public Rectangle{
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Rectangle side should be non negative");
        }
    }
    public static void printRectangleArea(double a, double b) {
        var text = String.format("Площадь прямоугольника со сторонами %f и %f = %f", a, b, ractangleArea(a, b));
        System.out.println(text);
    }

    private static double ractangleArea(double a, double b) {
        return a * b;
    }
}
