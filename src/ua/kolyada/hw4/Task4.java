package ua.kolyada.hw4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] randomArray = new int[2000];
        for (int a = 0; a < randomArray.length; a++) {
            randomArray[a] = (int) (Math.random() * 10) +1;
        }
        System.out.println(Arrays.toString(randomArray));
        evenToZero(randomArray);
    }
    private static void evenToZero(int[] randomArray) {
        for (int a = 0; a < randomArray.length; a++) {
            if (randomArray[a] % 2 == 0) {
                randomArray[a] = 0;
            }
        }
        System.out.println(Arrays.toString(randomArray));
    }
}
