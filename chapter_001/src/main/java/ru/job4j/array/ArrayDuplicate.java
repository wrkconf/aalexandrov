package ru.job4j.array;
import java.util.Arrays;

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int dublicate = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length - dublicate; j++) {
                if (array[j].equals(array[i])) {
                    dublicate += 1;
                    String temp = array[j];
                    for (int x = j; x < array.length - dublicate - 1; x++) {
                        array[x] = array[x+1];
                    }
                    array[array.length - dublicate] = temp;
                    j -= 1;
                }
            }
        }
        return Arrays.copyOf(array, array.length - dublicate );
    }
}
