package ua.kolyada.hw4;

public class Task2 {
    public static void main(String[] args) {
        int[] randomArray = new int[1000];
        for (int a = 0; a < randomArray.length; a++) {
            randomArray[a] = (int) (Math.random() * 10) + 1;
        }
        System.out.println("Quantity of Primes in Array is " + primeNumbers(randomArray));
    }

    private static int primeNumbers(int[] randomArray) {
        int result = 0;
        for (int a : randomArray) {
            boolean b = a > 0;
            for (int j = 2; j < a; j++) {
                if (a % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                result++;
            }
        }
        return result;
    }
}