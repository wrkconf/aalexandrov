package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int input = 5;
        Factorial factorial = new Factorial();
        int result = factorial.calc(input);
        assertThat(result, is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int input = 0;
        Factorial factorial = new Factorial();
        int result = factorial.calc(input);
        assertThat(result, is(1));
    }
}