package ru.job4j.array;

/**
 * Created by Home on 03.02.2018.
 */
public class Square {

    public int[] calculate(int bound) {
        int[] rsl = new int[bound];
        for (int i = 0; i < bound; i++) {
            rsl[i] = (i+1)*(i+1);
        }
        return rsl;
    }
}
