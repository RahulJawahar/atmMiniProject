package User;

import java.util.ArrayList;

public class Transaction {

    public String type;
    public int amount;

    public static ArrayList<Transaction> list = new ArrayList<>();

    public Transaction(String type, int amount) {
        this.type = type;
        this.amount = amount;

        list.add(this);
    }
}