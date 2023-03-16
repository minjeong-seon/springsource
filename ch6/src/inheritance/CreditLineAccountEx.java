package inheritance;

public class CreditLineAccountEx {

	public static void main(String[] args) {
		CreditLineAccount creditLineAccount 
		= new CreditLineAccount("110-22","홍길동",100000,5000000);

		//금액이 큰 경우
		System.out.println("사용액: "+creditLineAccount.withdraw(6000000));
		System.out.println("현재 잔액: "+creditLineAccount.getBalance());
		//금액이 맞는 경우
		System.out.println("사용액: "+creditLineAccount.withdraw(4000000));
		System.out.println("현재 잔액: "+creditLineAccount.getBalance());
	}

}
