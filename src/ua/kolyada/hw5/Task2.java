package ua.kolyada.hw5;

public class Task2 {
    public static void main(String[] args) {
        int[][] twoDisArray = new int[5][5];
        fillArray(twoDisArray);
        System.out.println(isIncrement(twoDisArray) +"\t");
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
                System.out.print("\t" + twoDisArray[i][j] + "\t");
            }
            {
                System.out.println(" ");
            }
        }
        return twoDisArray;
    }

    public static boolean isIncrement(int[][] twoDisArray) {
        boolean increment = true;
        for (int i = 2; i < twoDisArray.length; i++) {
            for (int j = 2; j < twoDisArray.length; j++) {
                if (twoDisArray[i - 1][j - 1] > twoDisArray[i][j]) {
                    return false;
                }
            }
        }
        return increment;
    }
}