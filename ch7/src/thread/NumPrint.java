package thread;

// Thread 작성
//2) Runnable 인터페이스 구현(다중상속)
public class NumPrint implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {
			System.out.print(i);
		}
		
	}
}
