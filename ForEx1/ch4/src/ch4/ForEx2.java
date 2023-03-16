package ch4;

import java.util.Iterator;


//*반복문 : 어떤 작업이 반복적으로 수행되도록 할 때 사용
//종류 : For (주로 사용됨), while, do-while
public class ForEx2 {
	public static void main(String[] args) {
		//1) 주사위를 5번 던지기
		
//		int dice1=(int)(Math.random()*6)+1;
//		int dice2=(int)(Math.random()*6)+1;
//		int dice3=(int)(Math.random()*6)+1;
//		int dice4=(int)(Math.random()*6)+1;
//		int dice5=(int)(Math.random()*6)+1;
//
//		for (int i = 1; i < 6; i++) {
//			int dice1=(int)(Math.random()*6)+1;
//			System.out.println(dice1);
//		}
//	
		//2) 구구단 출력하기
		
//		for (int i = 1; i <= 10; i++) {
//			System.out.printf("5단 %d = %d\n",i,(5*i));
//		}
//	
//		//3) 사용자로부터 원하는 수를 입력받아 구구단 출력하기
//		Scanner sc=new Scanner(System.in);
//		System.out.println("원하는 구구단의 단을 입력하시오.");
//		int num1=Integer.parseInt(sc.nextLine());
//		for (int i = 1; i <= 10; i++) {
//			System.out.printf("구구단 %d = %d\n",i,(i*num1));
//		}
	
		//4) 3의 배수와 5의 배수 합 구하기(단, 1-100사이의 숫자) --조건문 사용
		int sum=0;
		for (int i = 1; i <= 100; i++) {
			//i가 3의 배수 or 5의 배수만 남도록 조건 설정하기
			if (i%3==0 || i%5==0) {
				sum=sum+i;
			}
		}
			System.out.println("3과 5의 배수의 합 = "+sum);
		
//		//5) 3의 배수 합(단, 9의 배수는 제외한 1-100사이의 숫자)
//			int sum=0;
//			for (int i = 1; i < 100; i++) {
//				if (i%3==0&&i%9!=0) {   //3의 배수인 조건 + 9의 배수가 아닌 조건
//					sum+=i;
//				}
//			}System.out.println("3의 배수 중 9의 배수를 제외한 값의 합 : "+sum);
//		
//		
	}

}
