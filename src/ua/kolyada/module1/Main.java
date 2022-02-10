package ua.kolyada.module1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arrayLength;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter the length of Array (10 or more)");
            while (!scan.hasNextInt()) {
                System.out.println("This is not a number! Enter at least 10");
                scan.next();
            }
            arrayLength = scan.nextInt();
        }
        while (arrayLength < 10);
        int[] randomArray = new int[arrayLength];
        fillArray(randomArray);
        System.out.println(Arrays.toString(randomArray));
        mkChoice(randomArray);
        System.out.println(Arrays.toString(changeArray(randomArray)));
    }

    public static int[] fillArray(int[] randomArray) {
        for (int a = 0; a < randomArray.length; a++) {
            int min = -100;
            int max = 100;
            int diff = max - min;
            Random random = new Random();
            randomArray[a] = random.nextInt(diff + 1);
            randomArray[a] += min;
        }
        return randomArray;
    }

    public static void mkChoice(int[] randomArray) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 to increment array or 2 to decrement");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                choice = 1;
                sortArrayInc(randomArray);
                break;
            case 2:
                choice = 2;
                sortArrayDec(randomArray);
                break;
            default:
                System.out.println("Enter correct choice");
                scan.next();
                break;
        }
    }

    public static int[] sortArrayInc(int[] randomArray) {
        for (int i = 0; i < randomArray.length; i++) {
            int min = randomArray[i];
            int minI = i;
            for (int j = i + 1; j < randomArray.length; j++) {
                if (randomArray[j] < min) {
                    min = randomArray[j];
                    minI = j;
                }
            }
            if (i != minI) {
                int temp = randomArray[i];
                randomArray[i] = randomArray[minI];
                randomArray[minI] = temp;
            }
        }
        System.out.println("Increment Array" + Arrays.toString(randomArray));
        return randomArray;
    }

    public static int[] sortArrayDec(int[] randomArray) {
        for (int i = 0; i < randomArray.length; i++) {
            int min = randomArray[i];
            int minI = i;
            for (int j = i + 1; j < randomArray.length; j++) {
                if (randomArray[j] > min) {
                    min = randomArray[j];
                    minI = j;
                }
            }
            if (i != minI) {
                int temp = randomArray[i];
                randomArray[i] = randomArray[minI];
                randomArray[minI] = temp;
            }
        }
        System.out.println("Decrement Array" + Arrays.toString(randomArray));
        return randomArray;
    }

    public static int[] changeArray(int[] randomArray) {
        for (int i = 2; i < randomArray.length; i += 3) {
            randomArray[i] = randomArray[i] * randomArray[i] * randomArray[i];
        }
        return randomArray;
    }
}