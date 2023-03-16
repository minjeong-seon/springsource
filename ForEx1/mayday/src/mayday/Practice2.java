package mayday;



public class Practice2 {

	public static void main(String[] args) {
		// 1)배열 중 최솟값과 최댓값의 합 구하기
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
	
		
	}

}
