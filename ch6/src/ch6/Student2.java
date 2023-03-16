package ch6;

public class Student2 {
	String name;
	int ban,no,kor,eng,math;
	
	
	
	public Student2(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal(){
		int sum=kor+eng+math;
		return sum;
	}
	double getAverage(){
		return getTotal()/(double)3;
		
	}

	//오버라이딩: 부모클래스>자식클래스로 상속받은 메소드를 재정의하여 사용

	@Override
	public String toString() {
		return "Student2 [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "총점="+"]";
	}
	
}
