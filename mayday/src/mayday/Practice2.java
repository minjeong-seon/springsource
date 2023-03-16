package mayday;



public class Practice2 {

	public static void main(String[] args) {
//		// 1)배열 중 최솟값과 최댓값의 합 구하기
//		int score[]= {79,88,33,100,55,95};
//		int max=score[0];
//		int min=score[0];
//		for (int i = 0; i < score.length; i++) {
//			if (max<score[i]) {
//				max=score[i];
//			}if (min>score[i]) {
//				min=score[i];
//			}	
//		}
	//==================================================
		//구구단 2~19단 출력하기
		for (int i = 2; i < 20; i++) {
			System.out.println();
			System.out.printf("%d단을 출력합니다.\n",i);
			System.out.println();
			for (int j = 1; j < 20; j++) {
				System.out.printf("%d x %d = %d\n",i,j,i*j);
			}
		}
		
	//==================================================	
		
		
		
		
		
	}

}
