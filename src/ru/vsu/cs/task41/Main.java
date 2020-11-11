package task41;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x = getNumber();
        showResult(calculateY(x));
    }

    public static double getNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number:");
        
        return scanner.nextDouble();
    }

    public static double calculateY(double number) {
        double a = 256;
        double b = a / number * number;
        double c = number * number + b;

        while (a >= 2) {
            a = a / 2;
            b = a / c;
            c = number * number + b;
        }
        double result = number / b;
        
        return result;
    }

    public static void showResult(double result) {
        System.out.print("Result:" + result);
    }
}
