package User;

import java.util.Scanner;

public class Withdraw {

    public static void withdraw(Account acc) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int amt = sc.nextInt();

        if (amt > acc.balance) {
            System.out.println("Insufficient balance");
            return;
        }

        acc.balance -= amt;

        new Transaction("Withdraw", amt);

        System.out.println("Withdrawn");
    }
}