import java.util.Scanner;

public class Lab4Q1 {

    // basic operations done here, 
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: cannot divide by zero");
            return 0;
        }
        return a / b;
    }

    // power method
    public static double power(double base, int exponent) {
        double result = 1;

        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // I am looping so user can do multiple calculations
        while (true) {

            System.out.print("Enter first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = input.nextDouble();

            System.out.print("Enter operation (+, -, *, /): ");
            char op = input.next().charAt(0);

            double result = 0;

            if (op == '+') {
                result = add(num1, num2);
            } else if (op == '-') {
                result = subtract(num1, num2);
            } else if (op == '*') {
                result = multiply(num1, num2);
            } else if (op == '/') {
                result = divide(num1, num2);
            } else {
                System.out.println("Invalid operation");
                continue;
            }

            System.out.println("Result: " + result);

            System.out.print("Do you want to continue? (y/n): ");
            char again = input.next().charAt(0);

            if (again != 'y') {
                break;
            }
        }
    }
}