package ru.stqa.geometry.figures;

import static java.lang.Math.sqrt;

public record Triangle(double a, double b, double c) {
    public double perimeter() {
        return (this.a + this.b + this.c);

    };
    public double area() {
        var p = ((this.a + this.b + this.c) * 0.5);
        return sqrt(p * (p - this.c) * (p - this.b) * (p - this.a));
    }

}
