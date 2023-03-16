package inter;

//implements: 구현(인터페이스를 구현할 때 사용)
//상속이랑 비슷한데, 인터페이스는 implements(구현), 클래스는 extends(상속)임

//fighter라는 클래스가 unit이라는 클래스를 상속받고+fightable이라는 인터페이스를 구현함
public class Fighter extends Unit implements Fightable {

	//추상메소드를 구현할 때는 항상 {구현부}가 필요.
	@Override
	public void attack() {
		

	}

	@Override
	public void move(int x, int y) {
		

	}

}
