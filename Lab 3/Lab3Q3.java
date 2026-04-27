import java.util.Scanner;

public class Lab3Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int day;

        System.out.printf("Enter a number between 1 and 7: ");
        day = input.nextInt();

        // I am using switch to print the day
        switch (day) {

            case 1:
                System.out.printf("Monday%n");
                break;

            case 2:
                System.out.printf("Tuesday%n");
                break;

            case 3:
                System.out.printf("Wednesday%n");
                break;

            case 4:
                System.out.printf("Thursday%n");
                break;

            case 5:
                System.out.printf("Friday%n");
                break;

            case 6:
                System.out.printf("Saturday%n");
                break;

            case 7:
                System.out.printf("Sunday%n");
                break;

            default:
                System.out.printf("Invalid number%n");
        }
    }
}
