package ch4;

import java.util.Scanner;

//보안문자 프로그램 비슷한 거 드디어 등장!
public class DoWhileEx2 {

	public static void main(String[] args) {
		// 1-100사이의 임의의 숫자를 저장(Math.random 이용)
		// 사용자는 임의의 숫자를 맞추는 게임
		// 임의의 숫자를 맞출 때까지 사용자로부터 계속 숫자를 입력받기
		
		int answer=(int)(Math.random()+100);   //100까지의 난수
		
		Scanner sc=new Scanner(System.in);
		int input = 0;   //사용자가 입력할 숫자를 저장할 변수
		do {
			System.out.print("1-100사이의 정수를 입력하시오.");   //반복할 출력값 입력
			input = Integer.parseInt(sc.nextLine());   //입력받을 숫자도 반복해야 함
			if (input>answer) {   //힌트 제공을 위한 if문 열기
				System.out.println("더 작은 수를 입력하시오.");
			}else if (input<answer) {
				System.out.println("더 큰 수를 입력하시오.");
			}
		} while (input!=answer);   //입력받은 값이 정답이 아니면 계속 do 블럭 반복
			System.out.println("정답!");  
		
		
	}

}
