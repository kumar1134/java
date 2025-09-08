import java.util.Scanner;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void acceptTransaction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter transaction type (deposit/withdraw): ");
        String type = scanner.nextLine();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        if (type.equalsIgnoreCase("deposit")) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else if (type.equalsIgnoreCase("withdraw")) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Invalid transaction type.");
        }
        System.out.println("Current balance: " + balance);
    }
}
