package ch3;

// Math,random()으로 임의의 정수 만들기

public class SwitchEx3 {
	public static void main(String[] args) {
		//임의의 정수 만들기
		
		//Math,random() : 난수(임의의 수)를 출력
		//실행 범위 : 0.0 <= (=Math,random() < 1.0
		System.out.println(Math.random());
		
		//실행 범위 : 원하는 정수 범위 내 난수 출력하기
		//        int num = (int)(Math.random() * 원하는 범위 최고 숫자 ) + start(스타트 숫자)
		int dice=(int)(Math.random()*6)+1;
		System.out.println(dice);
		
		switch (dice) {
		case 1:
			System.out.println("1번");
			break;
		case 2:
			System.out.println("2번");
			break;
		case 3:
			System.out.println("3번");
			break;
		case 4:
			System.out.println("4번");
			break;
		case 5:
			System.out.println("5번");
			break;
		default:
			System.out.println("6번");
			break;
		}
		
		
	}

}
