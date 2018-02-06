package ru.job4j.array;

/**
 * Created by Home on 03.02.2018.
 */
public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rsl = -1;
        for (int i = 0; i < data.length; i++) {
            if(data[i] == el ) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }
}
