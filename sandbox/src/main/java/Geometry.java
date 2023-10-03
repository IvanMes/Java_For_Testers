public class Geometry {
    public static void main(String[] args) {
        printSquareArea(7.0);
        printSquareArea(5.0);
        printSquareArea(3.0);
        
        printRectangleArea(3.0, 5.0);
        printRectangleArea(5.0, 7.0);
        printRectangleArea(9.0, 2.0);

    }

    private static void printRectangleArea(double a, double b) {
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b +" = " + ractangleArea(a, b));
    }

    private static double ractangleArea(double a, double b) {
        return a * b;
    }

    static void printSquareArea (double side){
        System.out.println("Площадь квадрата со стороной " + side + " = " + sqareArea(side));
    }

    private static double sqareArea(double a) {
        return a * a;
    }
}
