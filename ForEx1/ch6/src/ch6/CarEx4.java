package ch6;

import java.util.Scanner;

public class CarEx4 {

	public static void main(String[] args) {
		//입력받은 값으로 Car3 인스턴스 생성
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("제조사: ");
//		String company=sc.nextLine();
//		System.out.println("모델명: ");
//		String model=sc.nextLine();
//		System.out.println("색상: ");
//		String color=sc.nextLine();
//		System.out.println("최대속도: ");
//		int maxSpeed=Integer.parseInt(sc.nextLine());
//		
//		//입력받은 값을 인스턴스 생성
//		Car3 car = new Car3(company, model, color, maxSpeed);
//		System.out.println(car);

		//입력값으로 Car3인스턴스 3개 생성
		//배열 선언&생성
		Car3 cars[]=new Car3[3];
		
		for (int i = 0; i < cars.length; i++) {
			System.out.print("제조사: ");
			String company=sc.nextLine();
			System.out.print("모델명: ");
			String model=sc.nextLine();
			System.out.print("색상: ");
			String color=sc.nextLine();
			System.out.print("최대속도: ");
			int maxSpeed=Integer.parseInt(sc.nextLine());
			cars[i] = new Car3(company, model, color, maxSpeed);
			System.out.println("------------------");
		}
		
		//확인용 For문
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		//확인용 For문 대신 간략하게 향상된 For문 이용가능
		
		for (Car3 car:cars) {
			System.out.println(car);
		}
		
		
		
		
		
		
	}

}
