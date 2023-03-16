package inheritance.code;

import modifier.Account;


 class Modifer1 {
	Account acc=new Account();   //(public 생략 시 오류 발생)The type modifier.Account is not visible
//	String str="hello";
	//참조타입 기본값: null
	//기본값: 기본(정수)타입은 0 | 실수형은 0.0 | boolean은 false로 세팅됨
	int age;   
	
	private void print() {
		//Account가 가지고 있는 ano에 접근
		String ano=acc.getAno();
		System.out.println("ano : "+ano);
		
		acc.setAno("111-123");
		System.out.println("ano : "+acc.getAno());
	
	}
	
 public static void main(String[] args) {
	 //static 메소드에서 non-static 메소드 호출하기
	 // 1) 같은 Static 으로 만들기
	 //or  2) 객체 생성 후 접근하기
	Modifer1 modifer1 = new Modifer1();
	modifer1.print();
	
}
	
 
 }
