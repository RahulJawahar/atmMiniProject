package User;

public class MiniStatement {

    public static void show() {

        System.out.println("\n--- Mini Statement ---");

        for (Transaction t : Transaction.list) {
            System.out.println(t.type + " - " + t.amount);
        }
    }
}