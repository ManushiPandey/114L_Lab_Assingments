import java.util.Scanner;

public class Lab4Q2 {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPrime(int num) {

        if (num <= 1) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int getFactorial(int num) {
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }

        return sum;
    }

    public static int reverseNumber(int num) {
        int reverse = 0;

        while (num > 0) {
            reverse = reverse * 10 + (num % 10);
            num = num / 10;
        }

        return reverse;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("Is Even: " + isEven(num));
        System.out.println("Is Prime: " + isPrime(num));
        System.out.println("Factorial: " + getFactorial(num));
        System.out.println("Sum of Digits: " + sumOfDigits(num));
        System.out.println("Reverse Number: " + reverseNumber(num));
    }
}
