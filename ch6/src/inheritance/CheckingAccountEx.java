package inheritance;

public class CheckingAccountEx {

	public static void main(String[] args) {
		CheckingAccount checkingAccount = new CheckingAccount("123-123", "홍길동", 100000, "4444-5555");
		
		//카드번호 불일치: 메시지 출력
		checkingAccount.pay("4444-6666", 50000);
		
		//카드번호 일치: 지불 후 잔액 출력
		int balance = checkingAccount.pay("4444-5555", 60000);
		System.out.println("사용액 지불 후 잔액"+balance);
}
	

}
