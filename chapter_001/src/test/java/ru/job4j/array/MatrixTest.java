package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class MatrixTest {
    @Test
    public void matrixTwoOnTwo() {
        Matrix matrix = new Matrix();
        int[][] resultArray = matrix.multiple(2);
        int[][] expectArray = {{1, 2}, {2, 4}};
        assertThat(resultArray, is(expectArray));
    }
}
