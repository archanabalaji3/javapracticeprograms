package com.niit.java.exceptionhandling;

public class ExceptionHandle1 {
public int divide(int x, int y)
{
	try
	{
		return x/y;
	}
	catch(ArithmeticException ex) //catch execute if exception comes
	{
		System.out.println("please provide valid input");
	    return 0;
	}
	}
public static void main(String[] args) {
	ExceptionHandle1 ex=new ExceptionHandle1();
	ex.divide(5, 0);
}
}
