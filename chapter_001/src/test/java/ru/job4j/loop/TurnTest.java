package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.array.Turn;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void TurnEven() {
        Turn turn = new Turn();
        int[] data = {1, 2, 3, 4};
        int[] resultArray = turn.back(data);
        int[] expectArray = {4, 3, 2, 1};
        assertThat(resultArray, is(expectArray));
    }

    @Test
    public void TurnOdd() {
        Turn turn = new Turn();
        int[] data = {1, 2, 3, 4, 5};
        int[] resultArray = turn.back(data);
        int[] expectArray = {5, 4, 3, 2, 1};
        assertThat(resultArray, is(expectArray));
    }
}
