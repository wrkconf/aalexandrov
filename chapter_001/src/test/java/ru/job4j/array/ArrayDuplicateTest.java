package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] array = {"Привет", "Мир", "Вода", "Нафталин", "Java", "Вода", "Нафталин", "Мир", "Привет"};
        String[] resultArray = arrayDuplicate.remove(array);
        String[] expectArray = {"Привет", "Мир", "Вода", "Нафталин", "Java"};
        assertThat(resultArray, is(expectArray));
    }
}
