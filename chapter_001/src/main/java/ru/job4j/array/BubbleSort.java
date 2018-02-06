package ru.job4j.array;


public class BubbleSort {
    public int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (!(array[i] < array[i-1])) {
                for (int j = 0; j < array.length - 1; j++) {
                    if (array[j]>array[j+1]){
                        int temp = array[j+1];
                        array[j+1] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        return array;
    }
}
