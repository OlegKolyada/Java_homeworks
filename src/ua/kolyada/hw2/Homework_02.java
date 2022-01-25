package ua.kolyada.hw2;
import java.util.Scanner;

public class Homework_02 {
    public static void main(String[] args) {
        double triArea;
        double x1, x2, x3, y1, y2, y3;
        double a, b, c;
        int number;

        System.out.println("Calculating the area if Triangle by Decart's coordinates ");
        System.out.println("Enter X1 ");
        Scanner inputX1 = new Scanner(System.in);
        x1 = inputX1.nextDouble();
        System.out.println("Enter Y1 ");
        Scanner inputY1 = new Scanner(System.in);
        y1 = inputY1.nextDouble();
        System.out.println("Enter X2 ");
        Scanner inputX2 = new Scanner(System.in);
        x2 = inputX2.nextDouble();
        System.out.println("Enter Y2 ");
        Scanner inputY2 = new Scanner(System.in);
        y2 = inputY2.nextDouble();
        System.out.println("Enter X3 ");
        Scanner inputX3 = new Scanner(System.in);
        x3 = inputX3.nextDouble();
        System.out.println("Enter Y3 ");
        Scanner inputY3 = new Scanner(System.in);
        y3 = inputY3.nextDouble();

        triArea = Math.abs(0.5 * Math.abs((x2 - x1) * (y3 - y1) - (x3 - x1) * (y2 - y1)));
        {
            System.out.println("Area of triangle is " + triArea + " units");
        }
        System.out.println("Enter number to test on dividing on 2 ");
        Scanner inputNumber = new Scanner(System.in);
        number = inputNumber.nextInt();
        if (Math.abs(number % 2) == 0) {
            System.out.println("Number is dividing on 2");
        } else {
            System.out.println("Number is NOT dividing on 2");
        }

        System.out.println("Test of the ternary operator");
        System.out.println("Enter first Number ");
        Scanner inputA = new Scanner(System.in);
        a = inputA.nextDouble();
        System.out.println("Enter second Number ");
        Scanner inputB = new Scanner(System.in);
        b = inputB.nextDouble();
        System.out.println("Enter third Number ");
        Scanner inputC = new Scanner(System.in);
        c = inputC.nextDouble();

        double absA = (a < 0) ? -a : a;
        double absB = (b < 0) ? -b : b;
        double absC = (c < 0) ? -c : c;

        System.out.println("The smallest Number is " + ((absA < absB) ? ((absA < absC) ? absA : absC) : ((absB < absC) ? absB : absC)));

        System.out.println("Without ternary operator, more options");
        if (Math.abs(a) < Math.abs(b) && Math.abs(a) < Math.abs(c)) {
            System.out.println("The smallest Number is  " + a);
        } else if (Math.abs(b) < Math.abs(a) && Math.abs(b) < Math.abs(c)) {
            System.out.println("The smallest Number is " + b);
        } else if (Math.abs(c) < Math.abs(a) && Math.abs(c) < Math.abs(b)) {
            System.out.println("The smallest Number is  " + c);
        } else {
            System.out.println("All Numbers are EQUAL! ");
        }
        System.out.println("END OF PROGRAM");
    }
}