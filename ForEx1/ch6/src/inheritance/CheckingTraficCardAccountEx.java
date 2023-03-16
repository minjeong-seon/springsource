package inheritance;

public class CheckingTraficCardAccountEx {

	public static void main(String[] args) {
		CheckingTraficCardAccount chTraficCardAccount=
				new CheckingTraficCardAccount("110-112", "성춘향", 100000, "3333-4444", false);
		
		CheckingTraficCardAccount chTraficCardAccount2=
				new CheckingTraficCardAccount("110-123", "홍길동", 100000, "5555-4444", true);
		
		//교통카드 기능이 없을 때
		System.out.println(chTraficCardAccount.payTrafficCard("3333-4444", 2500));
		
		//교통카드 기능이 있을 때+카드번호 불일치
		System.out.println(chTraficCardAccount2.payTrafficCard("5553-4444", 4500));
		
		//교통카드 기능이 있을 때+카드번호 일치+잔고 여유
		System.out.println(chTraficCardAccount2.payTrafficCard("5555-4444", 15000));
	}
	

}
