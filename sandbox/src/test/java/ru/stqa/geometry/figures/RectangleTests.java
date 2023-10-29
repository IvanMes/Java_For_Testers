package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class RectangleTests {
    @Test
    void cannotCreateSquareWithNegativeSide() {
        try {
            new Rectangle(-5.0, 5.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {

        }
    }

    @Test
    void testEquals() {
        var r1 = new Rectangle(5, 4);
        var r2 = new Rectangle(4, 5);
        Assertions.assertEquals(r1, r2);
    }

    @Test
    void testEquals2() {
        var r1 = new Rectangle(5, 4);
        var r2 = new Rectangle(5, 4);
        Assertions.assertEquals(r1, r2);
    }
}
