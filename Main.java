import User.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.next();

        Account acc = Account.users.get(name);

        if (acc == null) {
            System.out.println("User not found");
            return;
        }

        int choice;

        do {
            System.out.println("\nWelcome " + acc.name);
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance");
            System.out.println("4. Change PIN");
            System.out.println("5. Mini Statement");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    Deposit.deposit(acc);
                    break;

                case 2:
                    Withdraw.withdraw(acc);
                    break;

                case 3:
                    Balance.show(acc);
                    break;

                case 4:
                    PinChange.change(acc);
                    break;

                case 5:
                    MiniStatement.show();
                    break;

                case 6:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 6);
    }
}