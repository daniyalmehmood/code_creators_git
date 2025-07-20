import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;

public class bank {

    static Scanner scanner = new Scanner(System.in); //scanner used for user input from the keyboard
    static List<Account> accounts = new ArrayList<>(); //stores all bank accounts

    public static void main(String[] args) {
        int choice;
        do {                              //do-while loop to repeat menu
            showMenu();
            System.out.print("Choose an option: ");
             choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {            //switch to execute functions based on user choice
                case 1 -> createAccount();
                case 2 -> depositMoney();
                case 3 -> withdrawMoney();
                case 4 -> viewBalances();
                case 5 -> viewTransactionshistory();
                case 6 -> System.out.println("Thanks for using Mini Bank");
                default -> System.out.println("Invalid choice . Try again!");
            }

        } while (choice != 6);
    }

    static void showMenu() {
        System.out.println("1. Create Account");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. View Balance");
        System.out.println("5. View Transaction History");
        System.out.println("6. Exit");
    }

    static void createAccount() {
        System.out.print("Enter account number: ");
        String accNo = scanner.nextLine();

        if (findAccount(accNo) != null) {
            System.out.println("Account already exists!");
            return;
        }

        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();

        accounts.add(new Account(accNo, name));
        System.out.println("Account created successfully!");
    }

    static void depositMoney() {
        Account acc = getAccountByUser();
        if (acc == null) return;

        System.out.print("Enter amount to deposit: ");
        double amount = Double.parseDouble(scanner.nextLine());
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        acc.deposit(amount);
    }

    static void withdrawMoney() {
        Account acc = getAccountByUser();
        if (acc == null) return;

        System.out.print("Enter amount to withdraw: ");
        double amount = Double.parseDouble(scanner.nextLine());
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        acc.withdraw(amount);
    }

    static void viewBalances() {
        Account acc = getAccountByUser();
        if (acc != null) {
            System.out.printf("Balance: $%.2f%n", acc.getBalance());
        }
    }

    static void viewTransactionshistory() {
        Account acc = getAccountByUser();
        if (acc != null) {
            acc.printTransactions();
        }
    }

    static Account getAccountByUser() {
        System.out.print("Enter your account number: ");
        String accNo = scanner.nextLine();
        Account acc = findAccount(accNo);
        if (acc == null) {
            System.out.println("Account not found!");
        }
        return acc;
    }

    static Account findAccount(String accNo) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accNo)) {
                return acc;
            }
        }
        return null;
    }
}

class Account {
    private String accountNumber;
    private String holderName;
    private double balance;
    private List<Transaction> transactions;

    public Account(String accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction("Deposit", amount));
        System.out.println("Deposited $" + amount);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
            return;
        }
        balance -= amount;
        transactions.add(new Transaction("Withdraw", amount));
        System.out.println("Withdrew $" + amount);
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void printTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions yet.");
            return;
        }
        System.out.println("Transaction History:");
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}

class Transaction {
    private String type;
    private double amount;
    private LocalDateTime dateTime;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.dateTime = LocalDateTime.now();
    }

    public String toString() {
        return dateTime + " | " + type + ": $" + amount;
    }
}
