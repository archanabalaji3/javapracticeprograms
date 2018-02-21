package com.niit.java.thread;

public class Account {
	int balance;
public Account(int balance) //constructor
{
	this.balance=balance;
}
public void withdraw(int amount)
{
	balance=balance-amount;
	System.out.println("after withdraw an amount"+amount+"the balance is"+balance);
}
public void deposit(int amount)
{balance=balance+amount;
System.out.println("after deposit a amount"+amount+"the balance is"+balance);
	}
}
