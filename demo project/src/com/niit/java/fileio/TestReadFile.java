package com.niit.java.fileio;

import java.io.IOException;

public class TestReadFile {
public static void main(String[] args) {
	FileRead read=new FileRead();
	try {
		read.ReadFile("E:\\ARCHANA\\workspace1\\demo project\\src\\com\\niit\\java\\thread\\TestAccount.java");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}
