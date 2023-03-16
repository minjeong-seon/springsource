package thread;

//Thread 작성
//1) Thread 클래스 상속받기
public class SmallLetters extends Thread{
	
	@Override		//run 메소드 오버라이딩(run 컨 스)
	public void run() {
		//같이 실행할 코드 작성
		//a~z까지 출력
		for (char ch = 'a'; ch < 'z'; ch++) {
			System.out.print(ch);
		}
		
}
}
