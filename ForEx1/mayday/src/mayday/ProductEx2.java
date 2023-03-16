package mayday;

public class ProductEx2 {

	public static void main(String[] args) {
		//구매자 인스턴스 생성
		Buyer2 buyer = new Buyer2();
		
		//각각의 상품(자식클래스) 구매(초기화)
		buyer.buy(new Tv1());
		buyer.buy(new Computer());
		buyer.buy(new Audio());
		
		//카트 정보 출력
		buyer.sumary();
		

	}

}
