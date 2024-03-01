package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class TriangleTest {
    @Test
    public void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 8;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when00and60and06Then17dot9() {
        Point a = new Point(0, 0);
        Point b = new Point(6, 0);
        Point c = new Point(0, 6);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 17.999;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when02and30and03Then1dot5() {
        Point a = new Point(0, 2);
        Point b = new Point(3, 0);
        Point c = new Point(0, 3);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 1.5;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when50and50and50ThenMinus1() {
        Point a = new Point(5, 0);
        Point b = new Point(5, 0);
        Point c = new Point(5, 0);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = -1;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }
}

