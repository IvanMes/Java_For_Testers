package ru.stqa.geometry.figures;

public class Triangle {

    public static void printTrianglePerimeter(double a, double b, double c){
        String text = String.format("Площадь треугольника со сторонами %f, %f и %f = %f", a, b, c);
        System.out.println(text);
    }

    public static double area(double a, double b, double c) {
        return a * a;
    }

}
