package thread;

//Single Thread로 -, |를 출력하는 작업을 하나의 쓰레드가 연속적으로 처리
public class ThreadEx3 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("-"));
		}
		long end = System.currentTimeMillis();
		
		System.out.println("소요시간 1 "+(end-start));
		
		for (int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("|"));
		}
		end = System.currentTimeMillis();
		
		System.out.println("소요시간 2 "+(end-start));
		
		
	}

}
