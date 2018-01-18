package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int inputStart = 1;
        int inputFinish = 10;
        Counter counter = new Counter();
        int result = counter.add(inputStart,inputFinish);
        assertThat(result, is(30));
    }
}