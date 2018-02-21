package com.niit.java.multithreading;

public class RunnableThread implements Runnable{

	
	public void run() {
		System.out.println("In runnable Thread class");}
		{int table=6;
		for(int i=1; i<=10; i++)
		{
			System.out.println(table+"*"+i+"="+table*i);
		}
			
				
	}
		
		public static void main(String[] args) {
			RunnableThread rt=new RunnableThread();
			Thread t=new Thread(rt);
			t.start();
			int table=5;
			{
			for(int i=1; i<=10; i++)
			{
				System.out.println(table+"*"+i+"="+table*i);
			}
			}
		}
	}


