package com.celcom.day7;

import java.util.Scanner;

public class InterThreadCommunicationExample {

	public static void main(String[] args) throws InterruptedException {
		SavingAccount savingAccount = new SavingAccount();
		
		WithDrawer withdraw = new WithDrawer(savingAccount);
		withdraw.start();
		
		Thread.sleep(2000);
		
		Depositor deposit = new Depositor(savingAccount);
		deposit.start();
		
	}

}

class SavingAccount{
	private long balanceAmount;

	public long getBalanceAmount() {
		return balanceAmount;
	}

	public void withdraw(long amount) {
		balanceAmount = balanceAmount - amount;
	}

	public void deposit(long amount) {
		balanceAmount = balanceAmount + amount;
	}
	
}

class WithDrawer extends Thread{
	SavingAccount savingAccount;
	
	WithDrawer(SavingAccount savingAccount){
		this.savingAccount = savingAccount;
	}
	
	@Override
	public void run() {
		synchronized(savingAccount) {
			System.out.println("Withdrawer is waiting for the depositor to deposit the money");
		try {
			savingAccount.wait();
		} catch (InterruptedException e) {
		}
		System.out.println("Enter the amount to withdraw");
		long amount = new Scanner(System.in).nextLong();
		savingAccount.withdraw(amount);
		System.out.println(amount + "withdrew successfully");
		System.out.println("Balance: "+savingAccount.getBalanceAmount());
		}
	}
}

class Depositor extends Thread{
	SavingAccount savingAccount;
	
	Depositor(SavingAccount savingAccount){
		this.savingAccount = savingAccount;
	}
	
	@Override
	public void run() {
		synchronized (savingAccount) {
			System.out.println("Depositor started to depositing the money");
			System.out.println("Enter the amount to deposit ");
			long amount = new Scanner(System.in).nextLong();
			savingAccount.deposit(amount);
			System.out.println(amount+" deposited successfully");
			System.out.println("Balance: "+savingAccount.getBalanceAmount());
			savingAccount.notify();
		}
	}
	
}
