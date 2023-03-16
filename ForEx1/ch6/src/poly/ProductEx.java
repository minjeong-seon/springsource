package poly;

public class ProductEx {

	public static void main(String[] args) {
		//구매자 인스턴스 생성
		Buyer buyer = new Buyer();
		
		//Tv 구매
		Tv1 tv1 = new Tv1();
		buyer.buy(tv1);
		//buyer.buy(new Tv()); 도 가능.
		//▲왼|오가 동일하다면 위와 같이 줄이기 가능

		//컴퓨터 구매
		Computer computer = new Computer();
		buyer.buy(computer);   //buyer.buy(new Computer());
		
		//product 클래스>Tv1클래스>Computer클래스>product 클래스>buyer클래스 실행
		System.out.println("현재 남은 돈은 "+buyer.money+"만원입니다.");
		System.out.println("현재 보너스점수는 "+buyer.bonusPoitn+"점 입니다.");
	}

}
