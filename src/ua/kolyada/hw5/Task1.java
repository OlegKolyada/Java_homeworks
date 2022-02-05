package ua.kolyada.hw5;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[][] twoDisArray = new int[5][5];
        fillArray(twoDisArray);
        System.out.printf("%n" +Arrays.deepToString(twoDisArray));
        System.out.println();
    }

    public static int[][] fillArray(int[][] twoDisArray) {
        int k = 0;
        for (int i = 0; i < twoDisArray.length; i++) {
            for (int j = 0; j < twoDisArray[i].length; j++) {
                twoDisArray[i][j] = k + 1;
                k++;
            }
        }
        k = 1;
        for (int i = 0; i < twoDisArray.length; i++) {
            for (int j = 0; j < twoDisArray[i].length; j++) {
                if (i % 2 != 0)
                    twoDisArray[i][j] = k * (-1);
                k++;
            }
        }
        return twoDisArray;
    }
}