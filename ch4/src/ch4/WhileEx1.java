package ch4;

import java.util.Iterator;

//*반복문 : 어떤 작업이 반복적으로 수행되도록 할 때 사용
//종류 : For (주로 사용됨), while, do-while
public class WhileEx1 {

	public static void main(String[] args) {
//	for (int i = 0; i < args.length; i++) {
//		(처음 실행되는 식 < 조건식 < 블럭진입 후 실행되는 식)
//	다시 말해, 1)int i = 0 : 초기화 구문
//			 2)i < args.length;  : true/false 조건식 구문 (false일 때 반복문을 종료시키는 역할)
//			 3)조건식이 true일 때 블럭 안으로 진입
//		 	 4)i++ : 증감식
//		 	 5)i < args.length; 조건식 재검토
//			 ==>조건이 false가 나올 때까지 3~5과정(블럭진입>증감식 수행>조건문 재검토) 계속 반복
//	}

		for (int i = 0; i < 10; i++) {
			System.out.print(i+" ");
		}
			//*지역변수: i는 for반복문 블럭 안에서만 유효하게 작용*
		
		//***while 로 변경해보기*** -For문 대신 사용 가능
		
		int i = 0;  //초기화 구문
		while (i < 10) {  //while 문 오픈
			System.out.print(i+" ");  //출력식
			i++;  //증감식
		}
		
		
		
		
		System.out.println();    //enter 용으로 입력
		
//		for (int i = 10; i >= 1 ; i--) {
//			System.out.print(i+" ");
//		}
		//while로 바꾸기
		i=10;
		while (i >= 1) {
			System.out.print(i+" ");
			i--;
		}
		
		
		
		//조건식 내에서 홀수로 반복하고 싶을 때
		System.out.println();
//		for (int i = 1; i <= 10; i+=2) {   //i+=2 : i=i+2;를 줄여쓴 것
//			System.out.print(i+" ");
//		}
		//while로 바꾸기
		i=1;
		while (i<=10) {
			System.out.print(i+" ");
			i+=2;
		}
		
		
		
		
		//Hello를 세 번 반복하기
		System.out.println();
		
//		for (int i = 0; i < 3 ; i++) {
//			System.out.print("Hello ");
//		}
		//while로 바꾸기
		i=0;
		while (i < 3) {
			System.out.print("Hello ");
			i++;
		}
		
		
		
		
		//1~100까지 수를 짝수만 반복하기
		System.out.println();
		
//		for (int i = 2; i <= 100 ; i+=2) {
//			System.out.print(i+" ");
//		}
		//while로 바꾸기
		i=2;
		while (i <= 100) {
			System.out.print(i+" ");
			i+=2;
		}
		
		
		
		
		//1~10까지 덧셈 결과를 출력하기
				System.out.println();
//				int sum=0;  //변수 선언&초기화
//				for (int i = 1; i <= 10 ; i++) {
//					sum=sum+i;  //sum+=i;도 가능
//				}
//				System.out.println("1~10까지의 합 = "+sum);
				//while로 바꾸기
				i=1;
				int sum=0;
				while (i <= 10) {
					sum=sum+i;
					i++;
				}System.out.println("1~10까지의 합 = "+sum);
				
	}

}

