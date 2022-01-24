package ua.kolyada.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Please, enter any phrase");
        Scanner myScan = new Scanner(System.in);
        String phrase = myScan.nextLine();
        System.out.println(isPalindrome(""));
    }

    public static String noSpaces(String phrase) {
        String noSpacesString = phrase.replaceAll("\\s", "");
        return noSpacesString;
    }

    public static String revString(String noSpaces) {
        String result = "";
        for (int i = noSpaces.length() - 1; i >= 0; --i)
            result += noSpaces.charAt(i);
        return result;
    }

    public static Boolean isPalindrome(String noSpaces) {
        return noSpaces.equals(revString(noSpaces));
    }
}
