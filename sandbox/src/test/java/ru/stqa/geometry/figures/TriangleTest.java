package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    void canCalculateArea() {
        var s = new Triangle(6.0, 5.0, 2.2);
        double result = s.area();
        Assertions.assertEquals(5.279999999999998, result);
    }
    @Test
    void canCalculatePerimeter() {
        var s = new Triangle(6.0, 5.0, 2.2);
        double result = s.perimeter();
        Assertions.assertEquals(13.2, result);
    }
}
