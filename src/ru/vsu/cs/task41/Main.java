package task41;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x = getNumber();
        showResult(calculateY(x));
    }

    public static double getNumber() {
        double number;
        Scanner n1 = new Scanner(System.in);

        System.out.print("Input number:");
        number = n1.nextDouble();
        return number;
    }

    public static double calculateY(double number) {
        double result;
        double a = 256;
        double b = a / number * number;
        double c = number * number + b;

        while (a >= 2) {
            a = a / 2;
            b = a / c;
            c = number * number + b;
        }
        result = number / b;
        return result;
    }

    public static void showResult(double result) {
        System.out.print("Result:" + result);
    }
}
