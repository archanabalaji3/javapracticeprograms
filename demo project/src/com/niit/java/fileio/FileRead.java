package com.niit.java.fileio;

import java.io.FileInputStream;
import java.io.IOException;

public class FileRead {
public void ReadFile(String source) throws IOException
{
	FileInputStream inputstream=new FileInputStream(source);
	
	int b=0;
	while((b=inputstream.read())!=-1)
	{
		System.out.print(Character.toChars(b));
	}
}
}
