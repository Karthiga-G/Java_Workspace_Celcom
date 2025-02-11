import java.util.HashMap;
import java.util.Map;

class Account {
    private String accountNumber;
    private String customerName;
    private double balance;

    public Account(String accountNumber, String customerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " into account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from account " + accountNumber);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }
}

class Bank {
    private Map<String, Account> accounts;

    public Bank() {
        accounts = new HashMap<>();
    }

    public void addAccount(Account account) {
        if (!accounts.containsKey(account.getAccountNumber())) {
            accounts.put(account.getAccountNumber(), account);
            System.out.println("Account " + account.getAccountNumber() + " added to the bank.");
        } else {
            System.out.println("Account with number " + account.getAccountNumber() + " already exists.");
        }
    }

    public void removeAccount(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            accounts.remove(accountNumber);
            System.out.println("Account " + accountNumber + " removed from the bank.");
        } else {
            System.out.println("Account with number " + accountNumber + " does not exist.");
        }
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts in the bank.");
        } else {
            for (Account account : accounts.values()) {
                System.out.println("Account Number: " + account.getAccountNumber() + ", Customer: " + account.getCustomerName() + ", Balance: " + account.getBalance());
            }
        }
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("1001", "John Doe", 5000);
        Account account2 = new Account("1002", "Jane Smith", 3000);

        bank.addAccount(account1);
        bank.addAccount(account2);

        account1.deposit(1000);
        account1.withdraw(2000);
        account2.deposit(500);
        account2.withdraw(1500);

        System.out.println("Bank Account Details:");
        bank.displayAllAccounts();

        bank.removeAccount("1002");

        System.out.println("Bank Account Details after removal:");
        bank.displayAllAccounts();
    }
}
