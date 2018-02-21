package com.niit.java.exceptionhandling;

public class NestedCatch {
public static void main(String[] s) {
	int result=0;
	try {
	result=Integer.parseInt(s[0])/Integer.parseInt(s[1]);
	System.out.println(result);
	}
	catch(NumberFormatException e)
	{
		System.out.println("please give valid input");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("please give two values");
	}
	catch(ArithmeticException e)
	{
		System.out.println("the second value should not be zero");
	}

}

	
}
