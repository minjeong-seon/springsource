package ch6;
//특문: ※ → ← ▼ ◀ ▶ ▲
public class GoodsStockEx1 {
//매개변수를 가진 생성자 호출로 상품관리
	
	public static void main(String[] args) {
		//티셔츠에 대한 상품관리
		//GoodsStock goods = new GoodsStock();   //인스턴스화(객체생성)
		//-->default(기본) 생성자가 자동으로 호출됨
		//		:클래스에서 생성자를 명시하지 않아도 자동생성 됐기에 오류가 나지 않음
		//		: 클래스에서 생성자를 직접 생성했는데 위와 같이 'new 클래스명(無);'를 
		//			인스턴스화 한 경우 아래 ▼ 오류 발생
		//		→→→The constructor GoodsStock() is undefined
		
		//따라서 기본 생성자를 호출하지 않을 경우 아래와 같이 매개변수가 있는 생성자를 호출해야 함
		//매개변수를 가진 생성자 호출 -->초기화까지 한번에 해결됨
		GoodsStock goods = new GoodsStock("p123456",150); 
		
		System.out.println("현재 재고수량: "+goods.stock);

		//상품판매
		goods.subtrackStock();

	
	
	
	
	}
}
