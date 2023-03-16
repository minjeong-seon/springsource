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
 * 	2)문자 기반 스트림: 문자 단위로 데이터 전송ZX
 * 		ex) FileReader, FileWriter,...etc
 */

public class OutputStreamEx1 {
	public static void main(String[] args) {
		//InputStream: 추상클래스( Object 상속, Closeable 구현) --과거의 입력방식
		//Input: 키보드
		InputStream in = System.in;	//Scanner sc랑 같은 역할
		//output: 화면
		OutputStream out = System.out;	//syso랑 같은 역할
		
		try {
			//in.read(): 키보드를 입력 받으면 첫글자 1byte를 읽어오기(읽어올 byte가 없으면 -1리턴)
			//		->한글(3byte)을 입력하면 결과가 깨짐(영어만 바이트 표현 가능) > 인코딩이 UTF-8이라서
			int input=0;
			while ((input=in.read())!=-1) {
				out.write(input);
				}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
