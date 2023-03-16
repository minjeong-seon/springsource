package ch4;

import java.util.Scanner;

//*반복문 : 어떤 작업이 반복적으로 수행되도록 할 때 사용
//종류 : For (주로 사용됨), while, do-while
public class WhileEx3 {
	public static void main(String[] args) {
		//사용자로부터 숫자를 입력받기
		//숫자의 각 자리의 합 구하기
		// ex) 123456 => 1+2+3+4+5+6
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자 입력");
		int num = Integer.parseInt(sc.nextLine());
		int sum = 0;   //num의 각 자리수를 나타내기 위한 변수 선언/초기화
		while (num!=0) {   //0부터 스타트(입력받는 정수 계산에 범위제한 없음)
			sum=sum+num%10;   //sum+=num%10;으로 적을 수도 있음 = sum은 sum+(num을 10으로 나눈 나머지)
			System.out.printf("sum=%d num=%d\n", sum, num);   //sum과 num이 각 자릿수마다 합산되는 풀이 과정 반복문 설정
			num=num/10;   //num은 입력받은 수를 10으로 나눈 몫  ex)60/10=6
		}System.out.println("각 자리 숫자의 합 : "+sum);   //결과값 출력
		
		
		
	}

}

