package ua.kolyada.hw5;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] twoDisArray = new int[4][4];
        System.out.printf(Arrays.deepToString(fillArray(twoDisArray)));
        System.out.println();
        System.out.printf(Arrays.deepToString(transMatrix(twoDisArray)));
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

    public static int[][] transMatrix(int[][] twoDisArray) {
        int[][] tempArray = new int[twoDisArray[0].length][twoDisArray.length];
        for (int i = 0; i < twoDisArray.length; i++) {
            for (int j = 0; j < twoDisArray[0].length; j++){
                tempArray[j][i] = twoDisArray[i][j];
            }
        }
        return tempArray;
    }
}
