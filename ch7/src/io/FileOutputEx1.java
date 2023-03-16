package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class FileOutputEx1 {
	public static void main(String[] args) {
		//키보드에서 입력을 받아들여 파일에 쓰기
		//조건: 키보드에서 q가 입려고디기 전까지 계속 입력받기
		
		String str = null;		//입력받을 내용을 저장하는 변수
		try (Scanner sc=new Scanner(System.in);
				FileWriter fw=new FileWriter("c:\\temp\\output3.txt");
				BufferedWriter bw=new BufferedWriter(fw)){
			System.out.println("파일에 저장할 데이터를 입력해 주세요.");	
			System.out.println("입력 중단 키워드:  Q / q");
			do {
					System.out.println(">> ");
					str=sc.nextLine();		//사용자 입력 내용 저장
					if (!str.equalsIgnoreCase("q")) {		//입력된 문자가 q/Q가 아니면 입력문 실행
						bw.write(str);		//파일에 입력받은 내용 저장하기
						bw.newLine();		//줄바꿈
					}
				} while (!str.equalsIgnoreCase("q"));		// 입력된 문자가 q/Q가 아니면 계속 반복
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
