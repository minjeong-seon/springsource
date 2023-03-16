package ch5;

/*배열(array): 같은 타입의 여러 변수를 하나의 묶음으로 다루는 방법
 * int score1=99, score2=88, .....; <--효율성 떨어짐
 * 따라서>> 한 묶음(array)으로 처리해서 효율성을 높인다.
 * 		   ==> int score[];
 * 		   ==> score=new int[30]; 배열 생성
 */
public class ArrayEx1 {

	public static void main(String[] args) {
//		*'연속된 공간'에 int 값을 저장할 수 있는 n개의 공간 생성하기
//		*'연속된 공간' : Index를 이용해서 접근할 수 있음
//		*int 타입은 0으로 초기화 됨
//		*타입명 변수명[] = {입력값};
//		*System.out.println(변수명.length); ==> 해당 배열의 인덱스 길이
		
		int score[]=new int[30];    //선언 및 공간 30개 생성
		
		System.out.println(score[0]);   //0~29 를 인덱스로 접근
		System.out.println(score[15]);
		
		//새로운 값 할당하기
		score[0]=98;
		score[1]=88;
		
		//동일한 타입의 여러 값에 대하여 배열선언, 생성, 초기화
		//10명에 대한 점수를 배열로 다루기
		int score2[]= {98,88,78,68,58,65,45,60,75,43};
		
		System.out.println("다섯 번째 학생 점수 "+score2[4]);
		//5번째 학생은 0-1-2-3-'4'에 있으므로 인덱스 4까지
		
		
		double score3[]= {98.0,88,78.5,68,58.6,65,45.9,60,75.1,43};
		
		System.out.println("1번 학생 점수 "+score3[0]);
		System.out.println("2번 학생 점수 "+score3[1]);
		System.out.println("3번 학생 점수 "+score3[2]);
		System.out.println("4번 학생 점수 "+score3[3]);
		System.out.println("5번 학생 점수 "+score3[4]);
		System.out.println("6번 학생 점수 "+score3[5]);
		System.out.println("7번 학생 점수 "+score3[6]);
		System.out.println("8번 학생 점수 "+score3[7]);
		System.out.println("9번 학생 점수 "+score3[8]);
		System.out.println("10번 학생 점수 "+score3[9]);
		
//		▼스코어의 길이 출력하기
		System.out.println("score3 길이 "+score3.length);
		
//		▼반복문으로 간단하게 정리하기
		for (int i = 0; i < score3.length; i++) {   //배열은 for문 자동완성 시 조건문에 범위가 알아서 잡힘
			System.out.println((i+1)+"번째 학생 점수 "+score3[i]);
		}
		
		//char 5개를 담는 배열
		char ch[]= {'a','가','c','용','k'};
		

		//기본타입은 전부 byte, char, short, int, long, float, double, boolean ==> 배열타입 가능
		String stArr[]= {"abc","def"};
		System.out.println(stArr[2]);
		//--> 런타임 오류: 인덱스 범위를 벗어난 값을 출력하려 하면 Exception 에러가 발생
		//	index는 0부터 시작하므로 [2]는 존재하지 않는 범위
		
		
		
		
	}

}
