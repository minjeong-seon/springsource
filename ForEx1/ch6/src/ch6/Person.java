package ch6;

public class Person {
	String name;
	int height;
	int weight;
	
	void print() {
		System.out.println("이름: "+name);
		System.out.println("키: "+height);
		System.out.println("몸무게: "+weight);
	}
	
	//name 매개변수에 다른 값을 받아서 
	//Person에 가지고 있는 name 인스턴스변수 값을 변경
	public void setName(String name) {
		//name 이 공백이 아니고 null이 아니면 입력값 받기
		//		공백이거나 null이면 기본값: 홍길동
		if (name.equals("")||name==null) {
			this.name = "홍길동";
		}else {
			this.name = name;
		}
		print();
	}
	
	
	
	static void print2() {
		Person p=new Person();
		p.setName("");
	}
	
}