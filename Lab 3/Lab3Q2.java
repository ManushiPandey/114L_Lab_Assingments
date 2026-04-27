import java.util.Scanner;

public class Lab3Q2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int largest;

        System.out.printf("Enter number: ");
        largest = input.nextInt();

        // I already got the first number, so I only need 4 more
        for (int i = 2; i <= 5; i++) {

            System.out.printf("Enter number: ");
            number = input.nextInt();

            if (number > largest) {
                largest = number;
            }
        }

        System.out.printf("Largest number is: %d%n", largest);
    }
}