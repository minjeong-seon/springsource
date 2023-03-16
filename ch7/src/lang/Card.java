package lang;

public class Card {	
	//멤버변수
	String kind;
	int number;
	
	public Card() {
		//https://feastforall.tistory.com/29 <<참고하면 도움됨
		//생성자에서 다른 생성자 호출할 때 사용(생성자 오버로딩)
		this("SPADE", 1); //Card(String kind, int number)를 호출하라는 뜻(첫 줄에서만 가능)
		//this.kind="SPADE";, this.number=1; 을 줄여서 쓴 것
	}
	
	//생성자
	public Card(String string, int number) {
		super();
		this.kind = string;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Card [kind=" + kind + ", number=" + number + "]";
	}
	
	
//	@Override
//	public String toString() {
//		return "kind:"+kind+", number : "+number;
//	}
}
