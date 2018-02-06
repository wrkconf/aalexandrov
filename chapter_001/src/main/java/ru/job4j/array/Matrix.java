package ru.job4j.array;

/**
 * Created by Home on 03.02.2018.
 */
public class Matrix {
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.multiple(10);
    }

    public int[][] multiple(int size){
        int[][] matrix = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (i+1) * (j+1);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        return matrix;
    }
}
