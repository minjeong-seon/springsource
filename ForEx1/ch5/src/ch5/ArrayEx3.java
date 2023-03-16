package ch5;
//특문: ※ → ← ▼ ◀ ▶ ▲
public class ArrayEx3 {

	public static void main(String[] args) {
		//int[] score 와 int score[]는 차이가 없다.
		// [] : 1차원 배열
		// [][] : 2차원 배열(행, 열)
		
		// 1) 배열 총합과 평균 구하기
		int score[]= {100,88,100,100,90};

		int sum=0;
		float average=0f;
		for (int i = 0; i < score.length; i++) {
			sum+=score[i];
		}
		//average 값을 출력할 때 float에 담지 않으면 소숫점 이하 결과가 명확하게 도출되지 않는다.
		average=sum/(float)score.length;
		System.out.println("총합:"+sum);
		System.out.println("평균:"+average);

	}
}
