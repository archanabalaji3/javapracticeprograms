package com.niit.java.demo;

public class Demo { 
	public static void main(String[] args) {
		

			
				String str="niit t-nagar";
						int count=1;
				for(int i=0;i<str.length();i++)
				{
					if((str.charAt(i)== ' ')) {
						count++;
				}
				}
				System.out.println("number of words that given in string:"+count);
			}
			}