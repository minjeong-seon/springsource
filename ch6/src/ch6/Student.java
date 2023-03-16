package ch6;

public class Student {
	//학생이름 name ex)홍길동
	//학생반 ban ex)1
	//학생번호 no ex)1234
	//국어점수 kor ex)78
	//영어점수 eng ex)65
	//수학점수 math ex)65
	String name;
	int ban,no,kor,eng,math; //this.변수명

	//메소드에 쓰인 매개변수가 멤버변수와 같을 때 유효범위에서 this.을 하지 않으면 매개변수를 호출한다. =변수를 정확하게 호출하고 싶을 때 this.사용
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	String Info() {
		int sum=kor+eng+math;
		double avg=(double)sum/3;
		return name+","+ban+","+kor+","+eng+","+math+","+sum+","+avg;
	}

	//[alt+shift+s > generate to string > generate]
	//메인 있는 클래스에서 Student의 주소값을 호출하면 주소가 아니라 각 매개변수에 내가 부여했던 값이 대입되어 나옴
	@Override
	public String toString() {
		return "Student [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
	}
	

	
}
