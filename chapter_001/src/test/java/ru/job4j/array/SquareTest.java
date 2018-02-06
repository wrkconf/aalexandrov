package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SquareTest {
    @Test
    public void whenBoundIsFive() {
        Square square = new Square();
        int[] result = square.calculate(5);
        int [] expected = {1, 4, 9, 16, 25};
        assertThat(result, is(expected));
    }

}
