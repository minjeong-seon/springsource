package ch6;

public class StudentEx2 {
	public static void main(String[] args) {
		//Student2 객체 배열로 선언(인스턴스화;new)
		Student2 stuArr[]=new Student2[5];
		
		//기본값 확인  //-->초기화 전 기본값 null
		System.out.println(stuArr[0]);
		
		//학생 5명 입력값 초기화 진행
		stuArr[0]=new Student2("홍길동", 1, 1, 45, 50, 85);
		stuArr[1]=new Student2("성춘향", 1, 2, 80, 75, 85);
		stuArr[2]=new Student2("윤동주", 1, 3, 95, 90, 100);
		stuArr[3]=new Student2("김이박", 1, 4, 100, 90, 55);
		stuArr[4]=new Student2("에미넴", 1, 5, 60, 100, 75);
		
		//[0]학생(홍길동)의 정보 출력
//		System.out.println("이름: "+stuArr[0].name);
//		System.out.println("반: "+stuArr[0].ban);
//		System.out.println("국어: "+stuArr[0].kor);
//		System.out.println("영어: "+stuArr[0].eng);
//		System.out.println("수학: "+stuArr[0].math);
		
		//모든 학생의 정보를 출력하려면 For문 응용
		for (int i = 0; i < stuArr.length; i++) {
			System.out.println("이름: "+stuArr[i].name);
			System.out.println("반: "+stuArr[i].ban);
			System.out.println("국어: "+stuArr[i].kor);
			System.out.println("영어: "+stuArr[i].eng);
			System.out.println("수학: "+stuArr[i].math);
			System.out.println("총점: "+stuArr[i].getTotal());
			System.out.printf("평균: %.2f",stuArr[i].getAverage());
			System.out.println();
			
		}
		
		
		
		
		
	}
}
