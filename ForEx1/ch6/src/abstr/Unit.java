package abstr;

public abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	//자식크래스에서 해야 하는 일이 동일하다면 부모클래스에서 구현 후 상속하기
	void stop() {
		System.out.println("정지한다.");
	}
}
