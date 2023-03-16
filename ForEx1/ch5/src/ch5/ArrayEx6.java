package ch5;

import java.util.Arrays;
import java.util.Iterator;

//특문: ※ → ← ▼ ◀ ▶ ▲
public class ArrayEx6 {
	public static void main(String[] args) {
		// 4) Lotto 번호 6개 자동 뽑기
		int lucky[]=new int[45];
		
		for (int i = 0; i < lucky.length; i++) {
			lucky[i]=i+1;   //1~45까지 숫자 범위 설정
		}
		System.out.println(Arrays.toString(lucky));
		
		for (int i = 0; i < 6; i++) {
			//0~44범위 임의의 값
			int R = (int)(Math.random()*45);
			int temp = lucky[i];
			lucky[i] = lucky[R];
			lucky[R] = temp;
			System.out.print(lucky[i]+" ");
		}
		
		
		
		
		
		
	}
}
