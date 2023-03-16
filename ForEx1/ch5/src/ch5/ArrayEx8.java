package ch5;
//특문: ※ → ← ▼ ◀ ▶ ▲

public class ArrayEx8 {
	public static void main(String[] args) {
		//[행][열] : 2차원 배열
		//	중첩For문을 이용
		
		//2차원 배열 선언+생성
		int[][] score =new int[4][3];
		int [] score2[] =new int [2][3];
//		int score3[][]=new int [5][4];
		System.out.println(score2[0][0]);   //0행0열의 값
		System.out.println(score2[1][2]);   //1행2열의 값
		System.out.println("행길이 : "+score2.length);		//2차원 배열에서 length = [행]의 길이
		System.out.println("열길이 : "+score2[0].length);		//2차원 배열에서 length = [열]의 길이

		for (int i = 0; i < score2.length; i++) {
			for (int j = 0; j < score2[i].length; j++) {   //열의 길이 범위에서 결과를 도출하기 위해 score2[i]지정
				System.out.printf("%d\t",score[i][j]);
			}System.out.println();
		}
		
		
		//향상된 For문으로 2차원 배열 접근
		//2차원 배열의 선언+생성+초기화까지 된 상태
		int [] score4[] = {
						{10,11,12},
						{20,21,22},
		};
		
		for (int arr[] : score4) {  //첫열의 범위: arr = {10,11,12}
			for(int j : arr) { 
				System.out.printf("%d\t",j);
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}
}
