package ch6;

import java.util.Scanner;

//특문: ※ → ← ▼ ◀ ▶ ▲
public class GoodsStockEx2 {
	
	public static void main(String[] args) {
		//입력값으로 GoodsStock 인스턴스 생성
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("상품코드: ");
//		String code = sc.nextLine();
//		System.out.println("재고수량: ");
//		int stock = Integer.parseInt(sc.nextLine());
//		
//		GoodsStock gs=new GoodsStock(code, stock);
//		System.out.println(gs);
	
	
		//3개의 상품에 대하여 인스턴스 생성 -배열 이용
		GoodsStock goods[]=new GoodsStock[3];
//		goods[0]=new GoodsStock("p1001, 200");
//		goods[1]=new GoodsStock("p1002, 150");
//		goods[2]=new GoodsStock("p1003, 180");
//		위 세 줄의 코드를 입력값으로 변경
		for (int i = 0; i < goods.length; i++) {
			System.out.println("상품코드: ");
			String code = sc.nextLine();
			System.out.println("재고수량: ");
			int stock = Integer.parseInt(sc.nextLine());
			goods[i]=new GoodsStock(code, stock);
			System.out.println("---------------------");
		}
		//확인용
		for (int i = 0; i < goods.length; i++) {
			System.out.println(goods[i]);
		}
		
		// ▲향상된 For문으로 확인하기
		// 인덱스[i]가 필요하지 않은 확인용 출력문은 향상된 For문으로 대체 가능
		for (GoodsStock gs:goods) {
			System.out.println(gs);
		}
	}
}
