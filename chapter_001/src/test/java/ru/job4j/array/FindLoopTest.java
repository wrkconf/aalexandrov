package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class FindLoopTest {
    @Test
    public void FindLoopTrue() {
        FindLoop findLoop = new FindLoop();
        int[] data = {1, 2, 3, 4, 5};
        int result = findLoop.indexOf(data, 4);
        int expected = 3;
        assertThat(result, is(expected));
    }

    @Test
    public void FindLoopFalse() {
        FindLoop findLoop = new FindLoop();
        int[] data = {1, 2, 3, 4, 5};
        int result = findLoop.indexOf(data, 6);
        int expected = -1;
        assertThat(result, is(expected));
    }
}
