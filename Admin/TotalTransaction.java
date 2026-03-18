package Admin;

import User.Transaction;

public class TotalTransaction {

    public static void show() {

        int total = 0;

        for (Transaction t : Transaction.list) {
            total += t.amount;
        }

        System.out.println("Total Transactions: " + Transaction.list.size());
        System.out.println("Total Amount: " + total);
    }
}