package ua.kolyada.hw4;

public class Task3 {
    public static void main(String[] args) {
        int[] randomArray = new int[1000];
        for (int a = 0; a < randomArray.length; a++) {
            randomArray[a] = (int) (Math.random() * 10) + 1;
        }
        System.out.println("Quantity of Composites in Array is " + compositeNumbers(randomArray));
    }

    private static int compositeNumbers(int[] randomArray) {
        int result = 0;
        for (int i : randomArray) {
            if (i > 2) {
                for (int j = 2; j * j <= i; j++)
                    if (i % j == 0) {
                        result++;
                    }
            }
        }
        return result;
    }
}