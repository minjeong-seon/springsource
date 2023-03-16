package ch6;

import java.util.Iterator;
import java.util.Scanner;

public class StudentEx3 {

	public static void main(String[] args) {
		//Student2 인스턴스 생성
		//사용자로부터 입력 받은 정보로 생성하기
		
		//사용자로부터 정보 입력받기
		Scanner sc = new Scanner(System.in);
//		System.out.println("이름: ");
//		String name=sc.nextLine();
//		System.out.println("반: ");
//		int ban=Integer.parseInt(sc.nextLine());
//		System.out.println("번호: ");
//		int no=Integer.parseInt(sc.nextLine());
//		System.out.println("국어: ");
//		int kor=Integer.parseInt(sc.nextLine());
//		System.out.println("영어: ");
//		int eng=Integer.parseInt(sc.nextLine());
//		System.out.println("수학: ");
//		int math=Integer.parseInt(sc.nextLine());
//		
//		//입력받은 정보를 기반으로 객체 생성
//		Student2 student=new Student2(name, ban, no, kor, eng, math);
//		//주소값이 아닌 인스턴스 변수가 가지고 있는 값으로 출력(to String())
//		System.out.println(student);

		//Stident2 입력값으로 인스턴스 3개 생성하기
		Student2 stuA[]=new Student2[3];
		for (int i = 0; i < stuA.length; i++) {
			System.out.print("이름: ");
			String name=sc.nextLine();
			System.out.print("반: ");
			int ban=Integer.parseInt(sc.nextLine());
			System.out.print("번호: ");
			int no=Integer.parseInt(sc.nextLine());
			System.out.print("국어: ");
			int kor=Integer.parseInt(sc.nextLine());
			System.out.print("영어: ");
			int eng=Integer.parseInt(sc.nextLine());
			System.out.print("수학: ");
			int math=Integer.parseInt(sc.nextLine());
			stuA[i]=new Student2(name, ban, no, kor, eng, math);
			System.out.println("총점: "+(kor+eng+math));
			System.out.printf("%.2f",(kor+eng+math)/3.0);
			
			System.out.println("-----------------");
		}
		for (int i = 0; i < stuA.length; i++) {
			System.out.println(stuA[i]);
		}
		
		for (Student2 stu:stuA) {
			System.out.println(stu);
		}
//		//향상된 For문
//		int arr[]=new int[3];
//		for (int num:arr) {
//			System.out.println(num);
//		}
		
		
		
	}

}


