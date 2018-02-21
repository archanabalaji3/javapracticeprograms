package com.niit.java.multithreading;

public class JoinThread extends Thread {
	public void run()
	{
		int t=5;
		for(int i=1;i<=10;i++)
		{
			System.out.println(t+"*"+i+"="+t*i);
			
		}
	}

}
