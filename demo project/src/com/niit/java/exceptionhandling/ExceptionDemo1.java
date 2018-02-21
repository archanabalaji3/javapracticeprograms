package com.niit.java.exceptionhandling;

public class ExceptionDemo1 {
public float divide(int x,int y)
{
	return x/y;
}
public static void main(String[] args) {
	ExceptionDemo1 ex=new ExceptionDemo1();
	System.out.println(ex.divide(10, 0));  
}
}
