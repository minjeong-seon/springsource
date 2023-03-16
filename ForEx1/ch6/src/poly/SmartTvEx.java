package poly;

public class SmartTvEx {

	public static void main(String[] args) {
		//참조변수와 인스턴스 타입이 일치(일반적으로 쓰던 방식)
		SmartTv smartTv = new SmartTv();
		
		//다형성: 부모 타입의 참조변수로 자식 타입 인스턴스 참조
		//		-> 부모 멤버변수 = new 자식
		Tv tv= new SmartTv();
		
		//참조변수의 타입에 따라 사용할 수 있는 멤버변수의 개수가 달라진다
		//tv와 samrtTv로 접근할 수 있는 범위의 차이가 생김(smatTv>tv)
		
		//SmartTv smartTv2 =  new Tv(); <--에러 발생(반드시 좌 부모 우 자식/부모여야 함)

	}

}
