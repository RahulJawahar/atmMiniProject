package User;

import java.util.HashMap;

public class Account {

    public String name;
    public int pin;
    public int balance;

    public static HashMap<String, Account> users = new HashMap<>();

    static {
        users.put("Rahul", new Account("Rahul", 1234, 10000));
        users.put("Vishal", new Account("Vishal", 1111, 8000));
    }

    public Account(String name, int pin, int balance) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;
    }
}