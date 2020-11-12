package task41;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double number = getNumber();
        showResult(calculateY(number));
    }

    public static double getNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number:");

        return scanner.nextDouble();
    }

    public static double calculateY(double number) {
        double squareOfNumber = number * number;
        double thePowerOfTwo = 256;
        double fraction = thePowerOfTwo / squareOfNumber;
        double denominator = squareOfNumber + fraction;

        while (thePowerOfTwo > 2) {
            thePowerOfTwo = thePowerOfTwo / 2;
            fraction = thePowerOfTwo / denominator;
            denominator = squareOfNumber + fraction;
        }

        return number / denominator;
    }

    public static void showResult(double result) {
        System.out.print("Result: " + result);
    }
}
