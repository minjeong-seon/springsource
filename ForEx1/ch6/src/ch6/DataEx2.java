package ch6;

public class DataEx2 {

	public static void main(String[] args) {
		//인스턴스(주소) 생성 
		//	==> 참조형 타입 변수명 = new 참조형타입();
		Data d=new Data();   
		d.x=10;  //값 저장
		Data d2=copy(d);  //temp에 담긴 값을 d2로 호출
		System.out.println("d.x = "+d.x);
		System.out.println("d2.x = "+d2.x);
	}
	
	static Data copy(Data d) {
		Data temp=new Data();  //temp에 대한 새 주소가 생김(인스턴스)
		temp.x=d.x;  //d.x의 값을 temp.x값에 대입
		return temp;   //d.x의 값을 갖게 된 temp로 리턴
	}
}
