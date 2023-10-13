package ru.stqa.geometry.figures;

import static java.lang.Math.sqrt;

public record Triangle(double a, double b, double c) {

    public Triangle{
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("Triangle side should be non negative");
        };
        if ((a + b) < c || (a + c) < b || (c + b) < a) {
            throw new IllegalArgumentException("Sum of two sides should be more then one");
        }
    }
    public double perimeter() {
        return (this.a + this.b + this.c);

    };
    public double area() {
        var p = ((this.a + this.b + this.c) * 0.5);
        return sqrt(p * (p - this.c) * (p - this.b) * (p - this.a));
    }

}
