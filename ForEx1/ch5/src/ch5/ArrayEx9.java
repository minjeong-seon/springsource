package ch5;

import java.util.Iterator;

//특문: ※ → ← ▼ ◀ ▶ ▲

public class ArrayEx9 {
	public static void main(String[] args) {
		// 5)과목별 점수 총점 및 평균 계산하기
		
		int score[][]= {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};
		int korTatal =0, engTotal =0, mathTotal =0;
		
		System.out.println("번호   국어   영어   수학   총점   평균");
		System.out.println("---------------------------------");
		
		for (int i = 0; i < score.length; i++) {
			int sum = 0;   //학생별 총점: 변수 선언, 초기화
			System.out.printf("%3d",i+1);		//학생 번호: 0행0열	
			
			for (int j = 0; j < score[i].length; j++) {
				sum+=score[i][j];   //학생별 총점: 총점+[행][열]
				System.out.printf("%5d", score[i][j]);     
			}
			korTatal += score[i][0];   //=score[0][0]+score[1][0]+score[2][0]+score[3][0]+score[4][0];
			engTotal += score[i][1];   //=score[0][1]+score[1][1]+score[2][1]+score[3][1]+score[4][1];
			mathTotal += score[i][2];   //=score[0][2]+score[1][2]+score[2][2]+score[3][2]+score[4][2];
			
			float avg=sum/(float)score[i].length;
			System.out.printf("%5d %5.1f\n",sum, avg);
		}
		System.out.println("---------------------------------");
		System.out.printf("총점: %d %d %d\n",korTatal,engTotal,mathTotal);
		
		

	
	}
}
