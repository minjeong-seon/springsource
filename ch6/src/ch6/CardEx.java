package ch6;

public class CardEx {

	public static void main(String[] args) {
		//스페이드 7번과 하트 3번 trump카드 만들기
		
		//1)클래스에 저장된 공통속성 호출: 클래스명.변수명
		Card.width=50;
		Card.height=80;
		System.out.println("Card width: "+Card.width);
		System.out.println("Card height: "+Card.height);
		
		//2)인스턴스화(객체생성)
		Card card1=new Card();
		
		//3)스페이드 7번 카드 초기화
		card1.kind="spade";
		card1.number=7;
		
		//4)하트 3번 카드 초기화
		Card card2=new Card();
		card2.kind="heart";
		card2.number=3;

		System.out.printf("Card %s %d의 크기는 (폭 %dcm, 높이 %dcm)\n",
				card1.kind,card1.number,Card.width,Card.height);
		System.out.printf("Card %s %d의 크기는 (폭 %dcm, 높이 %dcm)\n",
				card2.kind,card2.number,Card.width,Card.height);
		
System.out.println();

		//5)전체 카드 크기 변경
		Card.width=60;
		Card.height=90;
		System.out.printf("Card %s %d의 크기는 (폭 %dcm, 높이 %dcm)\n",
				card1.kind,card1.number,Card.width,Card.height);
		System.out.printf("Card %s %d의 크기는 (폭 %dcm, 높이 %dcm)\n",
				card2.kind,card2.number,Card.width,Card.height);
	
	}
}
