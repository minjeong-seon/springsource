package inheritance;

public class BonusPointAccount extends Account{
	//은행 기능 + 보너스 포인트 기능

	private int bonusPoint;
	
	public BonusPointAccount(String ano, String owner, int balance, int bonusPoint) {
		super(ano, owner, balance);
		this.bonusPoint=bonusPoint;
	}

	//예금기능
	//보너스 포인트 += 예금액*1%
	@Override
	void deposit(int amount) {
		//부모가 가진 예금 기능 호출
		super.deposit(amount);
		//보너스 포인트 += 예금액*1%
		bonusPoint+=amount*0.01;
	}
	
	
	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	
	
}
