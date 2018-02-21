package com.niit.java.multithreading;

public class TestExtendingThread {
public static void main(String[] args) {
	ExtendingThread t1=new ExtendingThread();
	t1.start();
	for(int i=1;i<=100;i++)
	{System.out.println("Main Thread:"+i);}
	
}
}
