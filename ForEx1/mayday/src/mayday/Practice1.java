package mayday;

import java.util.Arrays;

//import java.util.Iterator;

public class Practice1 {

	public static void main(String[] args) {
		
		// 1) 1~45 정수 범위에서 6자리 lotto 번호 랜덤 뽑기
		System.out.println("행운의 Lotto 번호 : ");
		for (int i = 1; i < 7; i++) {
			System.out.println((int)(Math.random()*45+1));
		}

		System.out.println();  //enter
		
		// 2) 1~100까지의 숫자 10단 곱셈
//		Scanner sc=new Scanner(System.in);
//		System.out.println("몇 단을 출력하시겠습니까?");
//		int num=Integer.parseInt(sc.nextLine());
//		for (int i = 1; i <= 10; i++) {
//			System.out.printf("%d*%d=%d\n",num,i,(num*i));
//		}
//		
//		System.out.println();  //enter
		
		// 3) 3x+2y=56 의 해 구하기 (단, x와 y는 1~10까지의 수)
//		for (int i = 1; i <= 10; i++) {
//			for (int j = 1; j <= 10; j++) {
//				if (3*i+2*j==50) {
//					System.out.printf("(%d , %d)\n",i,j);
//				}
//			}
//		}

		// 3) 1~45까지의 숫자 배열 777번 랜덤 셔플로 Lotto 번호 6자리 출력하기 
//		int lotto[]=new int[45];
//		for (int i = 0; i < lotto.length; i++) {
//			lotto[i]+=i+1;
//		}
//		System.out.println(Arrays.toString(lotto));
//		
//		for (int i = 0; i < 6; i++) {
//			int L = (int)(Math.random()*45);
//			int temp=lotto[i];
//			lotto[i]=lotto[L];
//			lotto[L]=temp;
//		}
//		for (int i = 0; i < 6; i++) {
//			System.out.print(lotto[i]+",");
//		}
//		
		
		
		
		
	}

}
