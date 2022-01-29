package ua.kolyada.hw2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Please enter any three numbers");
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        System.out.println("The smallest number is "+absSmallNumber(a, b, c));
    }
    public static double absSmallNumber(double a, double b, double c) {
        double absA = (a < 0) ? -a : a;
        double absB = (b < 0) ? -b : b;
        double absC = (c < 0) ? -c : c;
        double result = ((absA < absB) ? ((absA < absC) ? absA : absC) : ((absB < absC) ? absB : absC));
        return result;
    }
}
