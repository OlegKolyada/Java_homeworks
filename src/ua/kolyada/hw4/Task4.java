package ua.kolyada.hw4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] randomArray = new int[10];
        for (int a = 0; a < randomArray.length; a++) {
            randomArray[a] = (int) (Math.random() * 10) +1;
        }
        evenToZero(randomArray);
    }
    private static void evenToZero(int[] randomArray) {
        int[] randomArrayCopy = Arrays.copyOf(randomArray, randomArray.length);
        for (int i : randomArrayCopy) {
            if (randomArrayCopy[i] % 2 == 0) {
                randomArrayCopy[i] = 0;
            }
        }
        System.out.println(Arrays.toString(randomArrayCopy));
    }
}