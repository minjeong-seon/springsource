package ch6;

public class StudentEx {

	public static void main(String[] args) {
		Student stu=new Student("홍길동",1,1,100,60,76);
		String msg = stu.Info();
		System.out.println(msg);
		//msg 출력시 홍길동,1,1,100,60,76,점수합계,평균이 출력되도록 작성
		System.out.println(stu);  //stu가 가진 주소 출력
		
		//student2 객체생성
		Student2 stu2 = new Student2("성춘향",2,1,78,85,65);
		System.out.println("이름: "+stu2.name);
		System.out.println("총점: "+stu2.getTotal());
		System.out.println("평균: "+stu2.getAverage());
		//이름: 성춘향
		//총점: ###
		//평균: ###
		System.out.println(stu2);  //stu가 가진 주소 출력
		
		
	}
	
}
