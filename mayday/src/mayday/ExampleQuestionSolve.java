package mayday;

public class ExampleQuestionSolve {
	public static void main(String[] args) {
		//별찍기로 브레인 스토밍
		// 1) *** *** ***
		for (int i = 0; i <3; i++) {
			System.out.println("***");
		}
	
		// 2) * ** *** ****
		//1부터 점점 커짐
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		System.out.println();
		
		// 3) **** *** ** *
		//큰 수에서 1로
		for (int i = 5; i >=1 ; i--) {	
			for (int j = 0; j <i; j++) {
				System.out.print("*");
			}System.out.println("");
		}
		
		System.out.println();
		
//		// 4) 오른쪽 정렬 * ** *** ****
//		for (int i = 0; i < 5; i++) {		//공백은 3)을 뒤집어서(점점 작아짐)
//			for (int j = 4; j > i; j--) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k < i+1; k++) {	//별은 2)와 동일하게(점점 커짐)
//				System.out.print("ㅁ");
//			}System.out.println();
//		}
	
		// 5) 별모양 트리 만들기
		for (int s= 0; s < 5; s++) {		//반복할 행의 수를 의미
	      for (int i = 0; i < 5-s; i++) {		//행이 반복될 때마다 공백은 줄어든다
			System.out.print("  ");}
	      for (int j = 0; j < s*2+1; j++) {	//행이 반복될 때마다 별은 홀수로 증가한다
			System.out.print("*");
			}System.out.println("");
		}
	
		
		
		
	}
}
