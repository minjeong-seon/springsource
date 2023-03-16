package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileInputEx6 {
	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("c:\\temp\\good4kpicture.jpg");
				FileOutputStream fos = new FileOutputStream("C:\\Temp\\goodPic.jpg")){
			
			int data = 0;
			long start = System.currentTimeMillis();
			while ((data=fis.read())!=-1) {
				
			}
			long end=System.currentTimeMillis();
			System.out.println("InputStream / OutpuutStream 걸린 시간 >> "+(end-start)+"ms");
			
			} catch (Exception e) {
			e.printStackTrace();
		}
		
		//--------------------------------------------------
		//buffered를 쓰면 파일 복사에 얼마나 시간이 소요되는지 아래 코드로 계산
		
		try (FileInputStream fis = new FileInputStream("c:\\temp\\good4kpicture.jpg");
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("C:\\Temp\\goodPic.jpg");
				BufferedOutputStream bos = new BufferedOutputStream(fos)){
			//▲4줄을 2줄로 줄일 수 있음▼
			//BufferedInputStream bis = new BufferedInputStream( new FileInputStream("c:\\temp\\good4kpicture.jpg"))
			//BufferedOutputStream bos = new BufferedOutputStream( new FileOutputStream("c:\\temp\\goodPic.jpg"))
			
			int data = 0;
			byte[] b=new byte[8192];		//8kb
			long start = System.currentTimeMillis();
			
			while ((data=fis.read(b))!=-1) {
				bos.write(b);
			}
			long end=System.currentTimeMillis();
			System.out.println("InputStream / OutpuutStream 걸린 시간 >> "+(end-start)+"ms");
			
			} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
