package Assignment2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Account {
    String accountNumber;
    String customerName;
    double balance;
    String branchName; 

    Account(String accountNumber, String customerName, String branchName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.branchName = branchName;
        this.balance = initialBalance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Invalid withdrawal or insufficient funds.");
        }
    }
}

class Bank {
    Map<String, Account> accounts = new HashMap<>();

    // Add account to the bank
    void addAccount(Account account) {
        accounts.put(account.accountNumber, account);
        System.out.println("Account added: " + account.accountNumber);
    }

    // Remove account by using account number
    void removeAccount(String accountNumber) {
        if (accounts.remove(accountNumber) != null) {
            System.out.println("Account removed: " + accountNumber);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Display all the accounts in the bank
    void displayAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            System.out.println("Displaying all accounts:");
            for (Account account : accounts.values()) {
            	System.out.println("Account: " + account.accountNumber);
            	System.out.println("Customer: " + account.customerName);
                System.out.println("Branch: " + account.branchName);
                System.out.println("Balance: " + account.balance);
            }
        }
    }
}

public class BankProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Bank bank = new Bank();

        while (true) {
            System.out.println("\n--- Choose from the below options ---");
            System.out.println("1. Add Account");
            System.out.println("2. Remove Account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your option: ");
            
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accountNumber = sc.nextLine();
                    System.out.print("Enter customer name: ");
                    String customerName = sc.nextLine();
                    System.out.print("Enter branch name: ");
                    String branchName = sc.nextLine();
                    System.out.print("Enter initial balance: ");
                    double balance = sc.nextDouble();
                    
                    bank.addAccount(new Account(accountNumber, customerName, branchName, balance));
                    break;

                case 2:
                    System.out.print("Enter account number to remove: ");
                    accountNumber = sc.nextLine();
                    bank.removeAccount(accountNumber);
                    break;

                case 3:
                    System.out.print("Enter account number to deposit to: ");
                    accountNumber = sc.nextLine();
                    Account account = bank.accounts.get(accountNumber);
                    if (account != null) {
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = sc.nextDouble();
                        account.deposit(depositAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter account number to withdraw from: ");
                    accountNumber = sc.nextLine();
                    account = bank.accounts.get(accountNumber);
                    if (account != null) {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = sc.nextDouble();
                        account.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Account not found");
                    }
                    break;

                case 5:
                    bank.displayAccounts();
                    break;

                case 6:
                    System.out.println("Exit the bank application");
                    sc.close();
                    return;

                default:
                    System.out.println("Enter the valid choice.");
            }
        }
    }
}
