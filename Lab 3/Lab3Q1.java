import java.util.Scanner;

public class Lab3Q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int secretNumber = 7;
        int guess = 0;

        // this way I am asking until the user gets it right
        while (guess != secretNumber) {

            System.out.printf("Guess the number: ");
            guess = input.nextInt();

            if (guess < secretNumber) {
                System.out.printf("Too low%n");
            } else if (guess > secretNumber) {
                System.out.printf("Too high%n");
            } else {
                System.out.printf("Correct!%n");
            }
        }
    }
}
