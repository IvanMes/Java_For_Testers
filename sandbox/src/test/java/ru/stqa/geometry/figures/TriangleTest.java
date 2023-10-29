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

    @Test
    void cannotCreateTriangleWithNegativeSide() {
        try {
            new Triangle(-5.0, 5.0, -5.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {}
    }
    @Test
    void cannotCreateTriangleWithWrongLongOfSides() {
        try {
            new Triangle(3.0, 9.0, 4.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {

        }
    }

    @Test
    void testEquals() {
        var t1 = new Triangle(3.0, 4.0, 5.0);
        var t2 = new Triangle(3.0, 4.0, 5.0);
        Assertions.assertEquals(t1, t2);
    }

    @Test
    void testEquals2() {
        var t1 = new Triangle(3.0, 4.0, 5.0);
        var t2 = new Triangle(5.0, 3.0, 4.0);
        Assertions.assertEquals(t1, t2);
    }
}
