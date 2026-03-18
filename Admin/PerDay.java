package Admin;

import User.Transaction;

public class PerDay {

    public static void show() {

        System.out.println("Today's Transactions:");

        for (Transaction t : Transaction.list) {
            System.out.println(t.type + " - " + t.amount);
        }
    }
}