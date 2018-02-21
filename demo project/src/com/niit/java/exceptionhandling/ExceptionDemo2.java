package com.niit.java.exceptionhandling;

public class ExceptionDemo2 {
public void display(int A[])
{
	System.out.println(A[5]);
}
public static void main(String[] args) {
	ExceptionDemo2 ex=new ExceptionDemo2();
	int A[]= {5,6,7,8,9};
	ex.display(A);
}

}
