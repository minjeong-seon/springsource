package inheritance;
/*오버로딩: 하나의 클래스에 동일한 이름의 메소드(생성자)를 작성
 * 	-메소드 오버로딩, 생성자 오버로딩
 * 
 *오버라이딩: 상속
 *	-부모의 메소드와 동일한 시그니처(리턴타입, 메소드명, 매개변수)를 가진다
 *	->부모가 제공하는 기능 + 확장의 개념 (부모의 기능을 변경, 업그레이드 하고 싶을 때 사용)
 */
public class SubListString extends ListString {
	String name = "성춘향";
 
	@Override
	public void list() {
		super.list();  //parent class 메소드 호출
		System.out.println(name+" 하위 클래스 이름");   //자손 class 메소드 호출
	}
		 
	public void writer() {
		//list() 호출 -SubListString, ListString 둘 다
		System.out.println("하위 클래스 name 값 "+this.name);
		System.out.println("상위 클래스 name 값 "+super.name);
		list();  // this.list();도 가능
		super.list();
	}
}
