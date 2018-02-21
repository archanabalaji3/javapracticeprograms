package com.niit.java.polymorphism;

public class DepositAccount extends Account {
int getInterest(int amount,int duration)
{
	return amount*duration*6/100;
}
}
