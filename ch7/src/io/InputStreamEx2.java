package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*I/O(;Input/Output)
 * Input:  키보드
 * Output: 화면
 * 
 * 스트림(;Stream): 한쪽에서 다른 쪽으로 데이터를 전달하기 위해, 두 대상을 연결하고 데이터를 전송할 수 있는 것
 * 
 * 	1) 바이트 기반 스트림: 바이트 단위로 데이터 전송
 * 		  ex) FileInputStream, FileOutputStream,...etc
 * 
 * 	2)문자 기반 스트림: 문자 단위로 데이터 전송
 * 		ex) FileReader, FileWriter,...etc
 */

public class InputStreamEx2 {
	public static void main(String[] args) {
	//InputStream: 추상클래스( Object 상속, Closeable 구현)
		
//		//Input: 과거의 키보드 입력방식
//		InputStream in = System.in;	//Scanner sc랑 같은 역할
//		OutputStream out = System.out;
//		
//		try {
//			//read(byte[] b): byte 배열만큼 읽어옴(읽어올 바이트가 없으면 -1 return)
//			//write(byte[] b): byte 배열만큼 쓰기
//			byte[] b = new byte[100];
//			while (in.read(b)!=-1) {
//				out.write(b);
//				}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			//stream 닫기
//			try {
//				in.close();
//				out.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			
//		}
		
		
//		//try-with-resource : Closable을 구현한 클래스여야 함
//		try (InputStream in = System.in){
//			int input=0;
//			byte[] b = new byte[100];
//			while ((input=in.read()!=-1) {
//				System.out.println((char)input);
//				}
//		} catch (Exception e) {
//
//		}
//		finally {
//
//		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
