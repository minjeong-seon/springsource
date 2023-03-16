package ch6;
//특문: ※ → ← ▼ ◀ ▶ ▲
public class Account {
	//속성: 계좌번호(110-10-10000...), 계좌명의(홍길동), 잔액(정수)
	String accountNo;
	String owner;
	int balance;
	
	//기능: 예금하다, 인출하다  
	//메서드를 만들기 전 기능의 역할을 미리 적어야 실수를 줄일 수 있음
	
	
	public Account(String accountNo, String owner, int balance) {
		super();
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}
	
	
	//	예금하다: 현재 잔액=잔액+예금액, 현재 잔액을 리턴
	int deposit(int amount) {
		balance+=amount;
		return balance;
	}
	//	인출하다: 잔액>출금액, 현재잔액=잔액-출금액, 현재 잔액을 리턴
	int withdraw(int amount) {
		if (balance>amount) {
			balance-=amount;
		}
		return balance;
	}
	
}
