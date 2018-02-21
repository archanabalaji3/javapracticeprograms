package com.niit.java.multithreading;

public class ExtendingThread extends Thread {
public void run()
{
	System.out.println("Inside run method");
	for(int i=1;i<=100;i++)
	{System.out.println("Mythread:"+ i);
}
}
}
