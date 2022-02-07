package ua.kolyada.hw5;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] randomArray = new int[10];
        fillArray(randomArray);
        System.out.println(Arrays.toString(fillArray(randomArray)));
        System.out.println("Array's incremention is " +isIncrement(randomArray));
    }

    public static int[] fillArray(int[] randomArray) {
        for (int a = 0; a < randomArray.length; a++) {
            randomArray[a] = (int) (Math.random() * 10) + 1;
        }
        return randomArray;
    }

    public static boolean isIncrement(int[] randomArray) {
        boolean increment = true;
        for (int i = 1; i < randomArray.length; i++) {
                if (randomArray[i - 1] > randomArray[i]) {
                    return false;
                }
            }
        return increment;
    }
}