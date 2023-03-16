package ch5;
//특문: ※ → ← ▼ ◀ ▶ ▲
import java.util.Arrays;


/*기본타입: byte, char, short, int, long, float, double, boolean ▶ Stack구조
 *참조타입: String(클래스), 배열,  ▶ Stack구조 + Heep구조
 * 
 *stack 구조   →→   int alpha = 0;    :   변수타입 (주소) = 값;
 *	Stack에는 주소가 저장이 되고, Heep구조에는 값이 저장된다.
 *heep 구조   →→   
 *예시▼
 *public class HeapAreaEx01 {
	public static void main(String[] args) {
		int a[] = null; // int형 배열 선언 및 Stack 영역 공간 할당
		System.out.println(a); // 결과 : null
		a = new int[5]; // Heap 영역에 5개의 연속된 공간 할당 및 
		                // 변수 a에 참조값 할당
		System.out.println(a); // 결과 : @15db9742 (참조값)
		▲ 내용을 줄이면, int a[] = new int[5];
						System.out.println(a);   // 결과 : 
						
		
 */			 

public class ArrayEx2 {

	public static void main(String[] args) {
		
		//5개의 공간 선언과 생성
		int score[]=new int[5];
		//For문을 이용하여 값을 초기화
		for (int i = 0; i < score.length; i++) {
			score[i]=i*10;
		}
		System.out.println(score);   //출력값에 주소가 나온다.
		System.out.println(Arrays.toString(score));
		
	System.out.println();
		
		//출력해서 확인하기
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[2]);
		}
			
	System.out.println();
			
		//향상된 For문	←←←←←구글링 해서 개념 잡아놓기
		for (int i : score) {
			System.out.println(i);
		}	
		
	System.out.println();
		
		int iArr2[]=new int[10];
		//1~10 사이의 임의의 숫자를 생성하여 배열에 저장하기
		for (int i = 0; i < iArr2.length; i++) {
			iArr2[1]=(int)(Math.random()*10)+1;
		}
		//String 타입의 값을 출력하기 위해서는 아래 양식으로 입력해야 한다.
		System.out.println(Arrays.toString(iArr2));
		
	System.out.println();
		
		//문자, 문자열 값 출력 연습
		char chArr[]= {'a','b','c','d','가'};
		System.out.println(chArr);
		
		String stArr[]= {"abc","가나다"};
		System.out.println(Arrays.toString(stArr));
	}
}


