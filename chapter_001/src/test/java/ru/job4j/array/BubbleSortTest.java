package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {

    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] data = {1, 3, 2, 4, 7, 6, 5, 8, 10, 9};
        int[] resultArray = bubbleSort.sort(data);
        int[] expectArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(resultArray, is(expectArray));
    }
}
