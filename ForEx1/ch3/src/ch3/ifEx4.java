package ch3;

import java.util.Scanner;

public class ifEx4 {

	public static void main(String[] args) {
//		//1) 사용자로부터 근무시간을 입력받아 하루 일당 계산하기
//		// 8시간 근무 기준 시급: 9,800원
//		// 초과근무 시 1.5배를 지급
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("근무시간 입력해주세요");
//		int hours = Integer.parseInt(sc.nextLine());
//		
//		// 하루 8시간 근무시 8*9800 = 하루 일당
//		// 12시간 근무시 8*9800+4*9800*1.5 = 하루 일당
//		
//		if(hours<=8) {System.out.println(hours*9800);
//		
//	}
//		else if(hours>8) {System.out.println((hours-8)*9800*1.5 + 9800*8);}
//		
//		
//	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("근무시간을 입력해주세요.");
//		int hours = Integer.parseInt(sc.nextLine());
//		int rate = 9800; // = 시급
//				int pay = 0; // = 하루 일당
//		// 하루 8시간 근무시 8*9800 = 하루 일당
//		// 12시간 근무시 8*9800+4*9800*1.5 = 하루 일당
//		
//		if(hours>8) {pay = (int)((hours-8)*1.5*rate + rate*8);}
//		else {pay = hours*rate;}
//		System.out.printf("하루 일당: %d원", pay);
//		
//		 //키, 몸무게 입력 받기
//		 //저체중, 표준, 과체중 출력하는 프로그램 작성
//		
//		 (키-100)*0.9 < 몸무게 : 과체중
//		 //(키-100)*0.9 == 몸무게 : 표준
//		 //(키-100)*0.9 > 몸무게 : 저체중
//		 //if~else if, if~else if~else 사용
//		Scanner sc = new Scanner(System.in);
//		System.out.print("몸무게 : ");
//		double weight = Double.parseDouble(sc.nextLine());
//		System.out.print("키 : ");
//		double height = Double.parseDouble(sc.nextLine());
//		double result = (height-100)*0.9;
//		if(result<weight) {System.out.println("과체중");
//		
//		}
//		if(result==weight) {System.out.println("표준체중");
//		
//		}
//		if(result>weight) {System.out.println("저체중");
//		
//		}
//		
//		//윤년, 평년 구하기
//		int year=2023;
//		//윤년 : 연도를 4로 나눈 나머지가 0이고, 
//		//연도를 100으로 나눈 나머지가 0이 아니거나
//		//연도를 400으로 나눈 나머지가 0이면 윤년이다.
//		if(year%4==0 && year%100!=0 || year%400==0) {System.out.println("윤년");
//		
//		}
//		else {System.out.println("평년");
//		
//	}
//		
//		
		//임의의 숫자3개 입력받기
		//입력받은 3개의 숫자 중 가장 작은 수 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수 입력");
		int num1 =  Integer.parseInt(sc.nextLine());
		System.out.println("두번째 수 입력");
		int num2 =  Integer.parseInt(sc.nextLine());
		System.out.println("세번재 수 입력");
		int num3 =  Integer.parseInt(sc.nextLine());
		
		int min=num1;
		if(min>num2) {min=num2;}
		if(min>num3) {min=num3;}
		System.out.println("가장 작은 수 "+min);
		
		int max=num1;
		if(max<num2) {max=num2;}
		if(max<num3) {max=num3;}
		System.out.println("가장 큰 수 "+max);
}
}