package User;

import java.util.Scanner;

public class PinChange {

    public static void change(Account acc) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter old PIN: ");
        int oldPin = sc.nextInt();

        if (oldPin != acc.pin) {
            System.out.println("Wrong PIN");
            return;
        }

        System.out.print("Enter new PIN: ");
        acc.pin = sc.nextInt();

        System.out.println("PIN changed");
    }
}