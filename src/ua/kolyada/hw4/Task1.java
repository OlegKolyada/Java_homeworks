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
        double average = 0;
        if (randomArray.length > 0) {
            double sum = 0;
            for (int b = 0; b < randomArray.length; b++) {
                sum += randomArray[b];
            }
            average = sum / randomArray.length;
        }
        return average;
    }
    private static double geometricAverageOfArray(int[] randomArray) {
        double average = 0;
        if (randomArray.length > 0) {
            double sum = 0;
            for (int b = 0; b < randomArray.length; b++) {
                sum += randomArray[b];
            }
            average = Math.sqrt(sum);
        }
        return average;
    }
}
