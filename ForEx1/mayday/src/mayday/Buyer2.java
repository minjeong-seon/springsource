package mayday;

import java.util.Iterator;

public class Buyer2 {
	int money=1000;
	int bonusPoitn=0;
	
	//product를 상속받는 모든 자식들의 인스턴스를 담을 수 있도록 참조타입을 부모의 것(Product)으로 선언
	Product cart[]=new Product[5];   //구입한 제품을 저장하기 위한 배열
	int i=0;
	
	void buy(Product p) {
		if (money<p.price) {
			System.out.println("잔액 부족. 물건을 구매할 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoitn += p.bonusPoint;
		cart[i++]=p;
		//p를 출력할 때 주소값이 나오는 것을 방지+뭘 구매했는지 나오게 하기 위해
		//Tv1 & Computer에서 toString 으로 각각 오버라이딩 함
		System.out.println(p+"을/를 구매하셨습니다.");
 	}
	
		void sumary() {
			//구매한 물품에 대한 정보를 요약해서 보여주기
			//구입한 물품의 가격 합계
			//구입한 물품목록
			int sum=0;
			String itemList = "";
			
			for (int i = 0; i < cart.length; i++) {
				if (cart[i]==null)break; 
				
				sum += cart[i].price;
				itemList += cart[i]+", ";
					
			}
			System.out.println("구입하신 물품의 총 금액은 "+sum+"만원입니다.");
			System.out.println("구입하신 제품은 "+itemList+"입니다.");
		}
		
		
		
	}
	

