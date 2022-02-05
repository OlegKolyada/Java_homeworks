package ua.kolyada.hw4;

public class Task1 {
    public static void main(String[] args) {
        int[] randomArray = new int[400];
        for (int a = 0; a < 400; a++) {
            randomArray[a] = (int) (Math.random() * 10) +1;
        }

        System.out.println("Arithmetic average of array is "+arithmeticAverageOfArray(randomArray));
        System.out.println("Geometric average of array is "+geometricAverageOfArray(randomArray));
    }

    private static double arithmeticAverageOfArray(int[] randomArray) {
        double averageArith = 0;
        if (randomArray.length > 0) {
            double sum = 0;
            for (int i : randomArray) {
                sum += randomArray[i];
            }
            averageArith = sum / randomArray.length;
        }
        return averageArith;
    }
    private static double geometricAverageOfArray(int[] randomArray) {
        double averageGeom = 0;
        double j = 1.0D;
        if (randomArray.length > 0) {
            for (int i : randomArray) {
                j *= randomArray[i];
            }
            averageGeom = Math.pow(j, 1.0D / (double) randomArray.length);
        }
        return averageGeom;
    }
}