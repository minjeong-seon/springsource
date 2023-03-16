package inheritance;

public class BonusPointAccountEx {

	public static void main(String[] args) {
		BonusPointAccount bonusPointAccount 
		= new BonusPointAccount("123-123", "김이박", 0, 0);


		int amount=100000;
		bonusPointAccount.deposit(amount);
		System.out.println("예금액: "+amount);
		System.out.println("현재 보너스 포인트: "+bonusPointAccount.getBonusPoint());
		
	}

}
