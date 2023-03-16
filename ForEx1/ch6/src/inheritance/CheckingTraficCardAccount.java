package inheritance;

public class CheckingTraficCardAccount extends CheckingAccount{
	//은행+체크카드+교통카드 기능 구현
	private boolean hasTraficCard;  //교통카드 기능 여부
	
	public CheckingTraficCardAccount(String ano, String owner, int balance, String cardNo, boolean hasTraficCard) {
		super(ano, owner, balance, cardNo);
		this.hasTraficCard=hasTraficCard;
	}
	//교통비 지불(int payTrafficCard())
	//카드번호, 사용액을 매개변수로 받아 교통카드 기능이 있다면 지불처리
	//교카 기능 없으면 없다고 메시지 출력하기
	
	int payTrafficCard(String cardNo, int amount) {
		if (!this.hasTraficCard) {
			System.out.println("대중교통 이용불가");
			return 0;
		}//카드번호 일치+잔액 있으면 지불처리
		return super.pay(cardNo, amount);
	}
}
