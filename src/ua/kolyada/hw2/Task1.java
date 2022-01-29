package ua.kolyada.hw2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Calculating of the Area of Triangle by Decart's coordinates");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter X1");
        double x1 = scan.nextDouble();
        System.out.println("Enter Y1");
        double y1 = scan.nextDouble();
        System.out.println("Enter X2");
        double x2 = scan.nextDouble();
        System.out.println("Enter Y2");
        double y2 = scan.nextDouble();
        System.out.println("Enter X3");
        double x3 = scan.nextDouble();
        System.out.println("Enter Y3");
        double y3 = scan.nextDouble();
        System.out.println("The Area of Triangle is " +triangleArea(x1,x2,y1,y2,x3,y3));

    }
    public static double triangleArea(double x1, double x2, double y1, double y2, double x3, double y3) {
        double triArea = Math.abs(0.5 * Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)));
        return triArea;
    }
}
