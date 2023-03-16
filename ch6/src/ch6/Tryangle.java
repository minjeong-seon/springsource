package ch6;

public class Tryangle {
	//삼각형의 넓이 구하기
	
	//속성: 밑변, 높이 ==>정수
	int baseline;
	int height;
	
	//생성자 직접 생성(위치 상관 없음/일반적으로 변수, 상수 선언 뒤에 하긴 함)
	public Tryangle(int baseline, int height) {
		super();
		this.baseline = baseline;
		this.height = height;
	}

	//기능: 넓이 구하기(=밑변*높이/2)
	//리턴 결과 소숫점까지 받기
	double getArea(){
		return baseline*height/2.0;
	}
	
	
	
	
	
}
