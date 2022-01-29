package ua.kolyada.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Please, enter any phrase");
        Scanner myScan = new Scanner(System.in);
        String phrase = myScan.nextLine();
        noSpaces(phrase);
        isPalindrome(noSpaces(phrase));
    }

    public static String noSpaces(String phrase) {
        String noSpacesString = phrase.replaceAll("\\s", "");
        return noSpacesString;
    }

    public static void isPalindrome(String noSpacesString) {
        String revString = "";
        for (int i = noSpacesString.length() - 1; i >= 0; --i)
            revString += noSpacesString.charAt(i);
        if (noSpacesString.equals(revString)) {
            System.out.println("Your phrase is Palindrome");
        }
        else {
            System.out.println("Your Phrase is not Palindrome");
        }
    }
}
