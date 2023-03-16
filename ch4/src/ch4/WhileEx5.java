package ch4;

//while에 switch 얹기 : console program 만들기

import java.util.Scanner;

public class WhileEx5 {
	public static void main(String[] args) {
		
		boolean run=true;
		//*중요*반복되는 변수는 메인 메소드 범위 안에서 모두 사용할 수 있도록 위치 지정!!
		int balance=0;  //잔액을 저장할 변수  
		Scanner sc=new Scanner(System.in);
		
		while (run) {
			
			System.out.println("-------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔액 | 4.종료");
			System.out.println("-------------------");
			System.out.println("메뉴 선택 >>");
			
			int menu = Integer.parseInt(sc.nextLine());
//balance+= Integer.parseInt(sc.nextLine());  --이거 어떻게 쓸지 연구해야 함.
			switch (menu) {
			case 1:
				System.out.println("입금액을 입력하시오.");
				int amount = Integer.parseInt(sc.nextLine());  //
				balance=balance+amount;   //잔액 = 잔액+예금액  balance+= integer.parseInt(sc.nextLine());
				break;
			case 2:
				System.out.println("출금액을 입력하시오.");
				int withdraw = Integer.parseInt(sc.nextLine());  //
				balance=balance-withdraw;   // 잔액 = 잔액-출금액
				break;
			case 3:
				System.out.printf("현재 잔액: %d\n", balance);
				//혹은     //현재 잔액 출력 
				break;
			case 4:
				run=false;
				System.out.println("이용해 주셔서 감사합니다.");
				break;
			default:
				break;
			}
		}
		
		
		
		
		
	}

}
