package ch4;

import java.util.Iterator;
import java.util.Scanner;

//*반복문 : 어떤 작업이 반복적으로 수행되도록 할 때 사용
//종류 : For (주로 사용됨), while, do-while
public class ForEx3 {
	public static void main(String[] args) {
		//팩토리얼 : 4! = 4*3*2*1
		//사용자로부터 수를 입력받아 팩토리얼 출력하기
		
		Scanner sc=new Scanner(System.in);
		System.out.println("수를 입력하시오.");
		int num = Integer.parseInt(sc.nextLine());  //입력받을 숫자를 인식
		int fact = 1; //곱셈 결과를 저장할 변수
		for (int i = num; i >0; i--) {   //입력받은 숫자 num을 i에 대입
			fact=fact*i;
			}System.out.printf("%d! = %d",num,fact);

		
	}

}
