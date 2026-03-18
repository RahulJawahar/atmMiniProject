package User;

import java.util.Scanner;

public class Deposit {

    public static void deposit(Account acc) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int amt = sc.nextInt();

        acc.balance += amt;

        new Transaction("Deposit", amt);

        System.out.println("Deposited");
    }
}