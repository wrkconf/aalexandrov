package ru.job4j.array;

/**
 * Created by Home on 03.02.2018.
 */
public class Turn {

    public static void main(String[] args) {
        Turn turn = new Turn();
        int[] test = {1, 2 ,3 , 4 ,5};
        turn.back(test);

    }
    public int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = temp;
        }
        for (int x:array){
            System.out.println(x);
        }
        return array;
    }
}
