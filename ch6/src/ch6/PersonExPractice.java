package ch6;

public class PersonExPractice {

	public static void main(String[] args) {
		//외부의 정보를 불러오기 위해 해당 클래스 이름으로 객체 생성(인스턴스화)
		//		==>person이 갖고 있는 인스턴스 변수&메소드 사용 가능
		Person p=new Person();
		p.setName("");
		p.print();

		//외부에 있는 static 메소드를 (print2) 를 호출하고 싶을 때
		//해당 클래스명.변수명();   로 호출 가능. (Tv3, DataExMay 참고)
		Person.print2();
	}

}
