package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*	클래스 파일 하나에 여러 개의 클래스를 작성하는 것이 가능
 *	단, public 클래스는 하나만 존재해야 한다. 
 */

class Product{}
class Tv extends Product{}
class Audio extends Product{}

public class GenericsEx2 {
	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<>();
		ArrayList<Tv> tvList1 = new ArrayList<>();
		//? : 와일드카드
		//<? extends Product> : Product와 그 자식만 가능 = 오른쪽<>에 Product의 자식이나 Product가 올 수 있다.
		//<? super T> : T와 그 부모만 가능
		//<?> : 제한 없음. 모든 타입이 올 수 있다.
		ArrayList<? extends Product> tvList2 = new ArrayList<Tv>();
		List<Tv> tvList3 = new ArrayList<>();

		//ArraysList<Produst> : ArrayList에 Product 타입만 추가
		//부모-자식 관계의 객체들은 부모타입으로 선언된 상태여도 자식 객체를 담는 것이 가능하다
		productList.add(new Product());
		productList.add(new Tv());
		productList.add(new Audio());
		
		printAll((productList));
	}
	
	static void printAll(ArrayList<Product> A) {
		for (Product product : A) {
		System.out.println(product);	
		}
	}

}
