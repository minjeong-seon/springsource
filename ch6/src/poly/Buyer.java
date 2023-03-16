package poly;

public class Buyer {
	int money=1000;
	int bonusPoitn=0;
	
	void buy(Product p) {
		if (money<p.price) {
			System.out.println("잔액 부족. 물건을 구매할 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoitn += p.bonusPoint;
		//p를 출력할 때 주소값이 나오는 것을 방지+뭘 구매했는지 나오게 하기 위해
		//Tv1 & Computer에서 toString 으로 각각 오버라이딩 함
		System.out.println(p+"을/를 구매하셨습니다.");
		
	}
	
}
