package ch4;

//반복문 예제 풀이

public class WhileEx4 {
	public static void main(String[] args) {
		//문1) while, Math.random() 사용
		//	두 개의 주사위를 던져 나오는 값을 (값1, 값2)형태로 출력하고
		//	값의 합이 5가 아니면 계속 주사위를 던지고, 5인 경우 실행 종료
		//  WhileEx2 참고

		
//		while (true) {
//			int dice1=(int)(Math.random()*6)+1;
//			System.out.println("주사위 A = "+dice1);
//			int dice2=(int)(Math.random()*6)+1;
//			System.out.println("주사위 B = "+dice2);
//			int sum=dice1+dice2;
//			if (sum==5) break;
//			System.out.println("A+B="+sum);
//			
//		}System.out.println("합계 5가 나왔습니다!");
		
		//위에 꺼 짧은 ver.
		while (true) {
			int dice1=(int)(Math.random()*6)+1;
			int dice2=(int)(Math.random()*6)+1;
			System.out.printf("<%d | %d>\n",dice1,dice2);
			if (dice1+dice2==5) break;
		}System.out.println("합계 5가 나왔습니다!");
	

		System.out.println();
		//for, if 수행할 문장이 하나라면 {블럭}을 생략할 수 있다.
		if (true) System.out.println("True");
		//그러나 수행할 문장이 여러 문장이면 반드시 {블럭}으로 묶어야 한다.
		
		
		
	}
}

