package exam;
//추상클래스 상속 받은 자식클래스
public class Odd extends OddDetector {
	

	public Odd(int n) {
		super(n);
	
	}

	@Override
	public boolean isOdd() {
		if (getN()%2==1) {
			return true;
		}
		return false;
	}
	
}
