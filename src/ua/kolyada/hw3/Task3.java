package ua.kolyada.hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter any phrase");
        String phrase = scan.nextLine();
        System.out.println("The number of words in your phrase is "+countWords(phrase));
    }
    public static int countWords(String phrase) {
        if (phrase == null) {
            return 0;
        }
        final String [] words = phrase.split("[\\pP\\s&&[^']]+");
        return words.length;
    }
}
