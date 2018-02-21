package com.niit.java.polymorphism;

public class TestAccount {
public static void main(String[] args) {
	SavingAccount sa=new SavingAccount();
    DepositAccount da = new DepositAccount();
    System.out.println(sa.getInterest(1000, 4));
    System.out.println(da.getInterest(1000,4));
	
}
}
