package com.niit.java.userdefinedexception;

public class TestAccount {
public static void main(String[] args) {
	Account ac=new Account();
	try
	{
		ac.withdraw(5000);
		System.out.println("Your Transaction is sucessful");
	}
	catch(MinimumBalanceException e)
	{
		System.out.println("Your transaction is fail");
		e.printStackTrace();
	}
			
}
}
