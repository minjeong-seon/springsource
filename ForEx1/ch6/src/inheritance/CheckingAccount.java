package inheritance;
//은행계좌+체크카드
public class CheckingAccount extends Account {
	 private String cardNo;   //체크카드 번호
	 
	public CheckingAccount(String ano, String owner, int balance, String cardNo) {
		super(ano, owner, balance);
		this.cardNo=cardNo;  //자손 클래스 생성자는 바로 초기화
		
	}
	
	// 1)체크카드 사용액을 지불한다
	//카드번호, 사용액을 매개변수로 받아서 은행잔고보다 작은 경우 사용액을 지불
	int pay(String cardNo, int amount) {
		//카드넘버 불일치 + 사용액<잔액인 경우 지불불가 메시지 출력
		//super. 안 붙여도 됨
		if (!this.cardNo.equals(cardNo)||super.getBalance()<amount) {
			System.out.println("카드번호 혹은 잔액을 확인해주세요.");
			return 0;
		}	//잔액=잔액-사용액 리턴
		return super.withdraw(amount); //부모의 메서드 호출 (super.은 안 붙여도 됨)
		
		
//		setBalance(getBalance()-amount);
//		return getBalance();  //잔액리턴
	}

}
