package mayday;

import java.util.Arrays;

public class Practice4 {
	public static void main(String[] args) {
	
//		//로또 1~45번 배열 선언
//		int lotto[]=new int[45];
//		//배열에 1~45까지 차곡차곡 저장
//		for (int i = 0; i < lotto.length; i++) {
//			lotto[i]=i+1;
//		}
//		//저장된 배열 확인
//		System.out.println(Arrays.toString(lotto));
//		//배열 중 6개 정수 랜덤 뽑기
//		for (int i = 0; i < 6; i++) {
//			int a =(int)(Math.random()*45);
//			int temp=lotto[i];
//			lotto[i]=lotto[a];
//			lotto[a]=temp;
//			System.out.print(lotto[i]+",");
//		}
		
		
		
		
		
		
		int[][] array = {{95, 86}, {93,82,76},{78,77,85,95,80}};
		int sum=0;	//점수 총합
		double avg = 0.0;		//전체 평균
		int count =0;	//다차원 배열 길이 저장할 변수
		
		for (int i = 0; i < array.length; i++) {	// i 행
			for (int j = 0; j < array[i].length; j++) {	// j 열
				count++;
				sum=sum+array[i][j];		//배열 값 총합 = 행 값 + 열 값
				//count는 행+열 수행할 때마다 1씩 추가
				//예)array[0][0] => count=1; 
				//	array[0][1] => count=2;
				//	array[1][0] => count=3; ...요렇게 count값 저장
			}
		}
		avg = (double)sum/count;
		System.out.println(sum);
		System.out.println(avg);
		
		//int count 변수가 필요한 이유 쉽게 이해하기
		//없으면 평균값을 sum/(array[0].length + array[1].length + array[2].length)로 해야함
		System.out.println( array[0].length + array[1].length + array[2].length);

		
		
		
		
		
		
	}
}
