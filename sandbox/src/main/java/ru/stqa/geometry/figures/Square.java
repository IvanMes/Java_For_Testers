package ru.stqa.geometry.figures;

public class Square {
    public static void printSquareArea(double side){
        System.out.println("Площадь квадрата со стороной " + side + " = " + sqareArea(side));
    }

    private static double sqareArea(double a) {
        return a * a;
    }
}
