package ru.stqa.geometry.figures;

public class Rectangle {
    public static void printRectangleArea(double a, double b) {
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b +" = " + ractangleArea(a, b));
    }

    private static double ractangleArea(double a, double b) {
        return a * b;
    }
}
