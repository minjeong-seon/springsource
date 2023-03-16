package ch5;
//특문: ※ → ← ▼ ◀ ▶ ▲
public class ArrayEx4 {

	public static void main(String[] args) {
		
		// 2) 배열의 최솟값과 최댓값 구하기
		int score[]= {79,88,33,100,55,95};
		int max=score[0];
		int min=score[0];
		for (int i = 0; i < score.length; i++) {
			if (max<score[i]) {
				max=score[i];
			}if (min>score[i]) {
				min=score[i];
			}	
		}
		System.out.println("최댓값:"+max);
		System.out.println("최솟값:"+min);
		
		
		
		
	}
}
