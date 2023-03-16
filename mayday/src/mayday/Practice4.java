package mayday;

import java.util.Arrays;

public class Practice4 {
	public static void main(String[] args) {
	
		//로또 1~45번 배열 선언
		int lotto[]=new int[45];
		//배열에 1~45까지 차곡차곡 저장
		for (int i = 0; i < lotto.length; i++) {
			lotto[i]=i+1;
		}
		//저장된 배열 확인
		System.out.println(Arrays.toString(lotto));
		//배열 중 6개 정수 랜덤 뽑기
		for (int i = 0; i < 6; i++) {
			int a =(int)(Math.random()*45);
			int temp=lotto[i];
			lotto[i]=lotto[a];
			lotto[a]=temp;
			System.out.print(lotto[i]+",");
		}
		
	
		
	}
}
