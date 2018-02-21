package com.niit.java.polymorphism;

public class SavingAccount extends Account {

int getInterest(int amount, int duration) {
	
	return amount*duration*4/100;
}
}
