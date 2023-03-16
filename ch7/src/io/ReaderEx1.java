package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx1 {
	public static void main(String[] args) {
		//Reader, Writer :  문자 기반
		Reader reader = null;
			try {
				reader = new FileReader("c:\\temp\\file1.txt");
				int data=0;
				while((data=reader.read())!=-1) {
					System.out.print((char)data);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		
		
		
				

	}
}
