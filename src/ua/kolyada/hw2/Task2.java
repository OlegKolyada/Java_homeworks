package ua.kolyada.hw2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Please enter any Number");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        isDividingOnTwo(a);
    }
    public static void isDividingOnTwo(int a) {
        if (Math.abs(a) % 2 == 0) {
            System.out.println("The number is dividing on 2");
        }
        else {
            System.out.println("The number is not dividing on 2");
        }
        return;
    }
}
