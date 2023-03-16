package ch7;

public class Account {
	String accountNo;
	String owner;
	int balance;
	
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
		if (balance<amount) {
//		throw new RuntimeException("잔액부족");
		throw new BalanceInsufficientException("잔액부족");
		}	
		balance-=amount;
		return balance;
		
	}
}
