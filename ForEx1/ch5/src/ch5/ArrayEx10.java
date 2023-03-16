package ch5;

import java.util.Arrays;
import java.util.Scanner;

//특문: ※ → ← ▼ ◀ ▶ ▲
public class ArrayEx10 {
//단어 맞히기 게임
	public static void main(String[] args) {
		//사용자한테 답변을 받을 수 있도록 코드 작성
		//답과 비교할 때 equals를 사용해서 true인 경우 "정답입니다."
		//							 flase인 경우 "오답입니다. 정답은 ___입니다." 출력하기
		Scanner sc=new Scanner(System.in);
		
		String words[][]= {
				{"chair","의자"},
				{"computer","컴퓨터"},
				{"integer","정수"}
		};
		
		for (int i = 0; i < words.length; i++) {
			System.out.printf("0%d) %s의 뜻은?\n", i+1, words[i][0]);
			System.out.println("답: ");
			String answer=sc.nextLine();
			if (answer.equals(words[i][1])) {
				System.out.println("정답입니다.");
			}else {
				System.out.printf("틀렸습니다. 정답은 '%s'입니다.\n",words[i][1]);
			}
		}			
		
		
		
		
		
		
	}

}
