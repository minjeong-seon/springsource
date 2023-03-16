package exam;
//추상클래스
public abstract class OddDetector {
	private int n;
	
	public OddDetector(int n) {
		super();
		this.n = n;
	}

	public int getN() {
		return n;
	}
	
	public abstract boolean isOdd();
	
}
