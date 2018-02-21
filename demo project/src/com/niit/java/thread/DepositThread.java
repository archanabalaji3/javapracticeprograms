package com.niit.java.thread;

public class DepositThread extends Thread {
	private Account account;
	private int amount;
	public DepositThread(Account account, int amount)//constructor
	{this.account=account;
	this.amount=amount;
	}
	public void run()
	{
		account.deposit(amount);
	}
}
