package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputEx2Copy {
	public static void main(String[] args) {
		
		//try-with-catch로 이미지 파일 복사하기
		
		try (FileInputStream fis = new FileInputStream("c:\\temp\\good4kpicture.jpg");
				FileOutputStream fos = new FileOutputStream("C:\\Temp\\goodPic.jpg")){
			
			int data = 0;
			while ((data=fis.read())!=-1) {
				fos.write(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}