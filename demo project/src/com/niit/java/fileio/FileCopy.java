package com.niit.java.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	
public void copy(String source,String destination)
{
	FileInputStream inputstream = null;
	FileOutputStream outputstream = null;
	try {
		inputstream=new FileInputStream(source);
		outputstream=new FileOutputStream(destination);
		int b=0;
		while((b=inputstream.read())!=-1)
		{
			System.out.println(Character.toChars(b));
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} finally {
		try {
			inputstream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			outputstream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
}
