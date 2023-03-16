package ch6;

//상품관리 클래스

public class GoodsStock {
	//속성: 상품코드(ex. p123456), 재고수량(ex. 200)
	String code;
	int stock;
	
	//생성자를 명시하지 않으면 기본(default)생성자를 알아서 생성함
	//▼직접 명시하면 아래와 같이 생성됨 (클래스 명+ctrl+space bar--[constructor)]
//	public GoodsStock() {
//		// TODO Auto-generated constructor stub
//	}
	
	//생성자 직접 호출하기
	public GoodsStock(String code, int stock) {
		super();
		this.code = code;
		this.stock = stock;
	}
	
	
	//기능: 재고수량 감소/증가
	void addStock() {
		System.out.println("재고수량 증가");
	}
	void subtrackStock() {
		System.out.println("재고수량 감소");
	}


	@Override
	public String toString() {
		return "GoodsStock [code=" + code + ", stock=" + stock + "]";
	}
	
	
}
