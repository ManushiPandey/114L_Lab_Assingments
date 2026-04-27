import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // getting user info
        String fullName;
        String accountNumber;
        double balance;

        System.out.printf ("Enter full name: ");
        fullName = input.nextLine();

        System.out.printf("Enter account number: ");
        accountNumber = input.nextLine();

        System.out.printf("Enter initial balance: ");
        balance = input.nextDouble();

        // working with the name
        fullName = fullName.trim();
        fullName = fullName.toUpperCase();

        int space = fullName.indexOf(" ");
        String firstName = fullName.substring(0, space);

        int charCount = fullName.replace(" ", "").length();

        // checking account number
        if (accountNumber.length() != 8 || accountNumber.charAt(0) != '1') {
            System.out.printf("Invalid Account number%n");
            return;
        }

        for (int i = 0; i < accountNumber.length(); i++) {
            if (!Character.isDigit(accountNumber.charAt(i))) {
                System.out.printf("Invalid Account number%n");
                return;
            }
        }

        // deposit and withdrawal
        double deposit;
        double withdraw;

        System.out.printf("Enter deposit amount: ");
        deposit = input.nextDouble();
        balance = balance + deposit;

        System.out.printf("Enter withdrawal amount: ");
        withdraw = input.nextDouble();
        balance = balance - withdraw;

        input.nextLine();

        // creating pin
        String pin;
        String login;

        System.out.printf("Create a 4-digit PIN: ");
        pin = input.nextLine();

        if (pin.length() != 4) {
            System.out.printf("Invalid PIN%n");
            return;
        }

        for (int i = 0; i < pin.length(); i++) {
            if (!Character.isDigit(pin.charAt(i))) {
                System.out.printf("Invalid PIN%n");
                return;
            }
        }

        // login check
        System.out.printf("Enter PIN: ");
        login = input.nextLine();

        if (pin.equals(login)) {
            System.out.printf("Login Successful%n");
        } else {
            System.out.printf("Incorrect Pin%n");
            return;
        }

        // final output
        System.out.printf("%nACCOUNT SUMMARY%n");
        System.out.printf("---------------%n");
        System.out.printf("Name: %s%n", fullName);
        System.out.printf("Account Number: %s%n", accountNumber);
        System.out.printf("Final Balance: $%.2f%n", balance);
    }
}