package ch5;
//특문: ※ → ← ▼ ◀ ▶ ▲

import java.util.Arrays;

public class ArrayEx5 {

	public static void main(String[] args) {
		
		// 3) 배열의 자리 0번부터 랜덤 셔플하기
		int numArr[]= {0,1,2,3,4,5,6,7,8,9};   //원배열
		
		System.out.println(Arrays.toString(numArr));
		
		for (int i = 0; i < 100; i++) {   //100번 반복하여 셔플하기
			
			int a =(int)(Math.random()*10);  //a랜덤배열 만들기
			int temp=numArr[a];   //빈 공간 temp 안에 a랜덤 배열을 담기
			numArr[a]=numArr[0];   //a공간에 원래 배열numArr 담기
			numArr[0]=temp;	   //값을 전부 옮겼으니 비어 있는 원래 배열numArr은 빈 공간temp로 선언
			
			//System.out.println(Arrays.toString(numArr));  ←100번 수행한 결과를 전부 출력하기
			
		}System.out.println(Arrays.toString(numArr));   // ←100번 섞은 결과물 출력
		
		
		
	}
}
