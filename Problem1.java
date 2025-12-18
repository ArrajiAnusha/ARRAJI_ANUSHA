package javaProject;

import java.util.Scanner;

public class Problem1 {
	double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Problem1 prblm1 = new Problem1();

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add, sub, mul, div): ");
        String operation = sc.next();

        double result = 0;

        switch (operation) {
            case "add":
                result = prblm1.add(a, b);
                break;
            case "sub":
                result = prblm1.subtract(a, b);
                break;
            case "mul":
                result = prblm1.multiply(a, b);
                break;
            case "div":
                result = prblm1.divide(a, b);
                break;
            default:
                System.out.println("Invalid Operation");
                return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}


