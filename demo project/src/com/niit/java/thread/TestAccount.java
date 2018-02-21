package com.niit.java.thread;

public class TestAccount {
public static void main(String[] args) {
	Account acc=new Account(10000);
	WithdrawThread wt=new WithdrawThread(acc, 1500);
    wt.start();
    DepositThread dt=new DepositThread(acc, 2500);
    dt.start();
}
}
