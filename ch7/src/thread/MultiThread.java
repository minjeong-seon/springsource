package thread;

import javax.swing.JOptionPane;

public class MultiThread {
//두 쓰레드가 서로 다른 자원을 사용하는 작업의 경우에는 멀티쓰레드 프로세스가 더 효율적임
	public static void main(String[] args) throws InterruptedException {
		
		ThreadEx6 t1 = new ThreadEx6();
		//실행대기열에 저장되어 자신의 차례가 올 때가지 기다림
		t1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 "+input+"입니다.");
		
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			Thread.sleep(1000); 	//1초간 시간 지연
		}
		
		
		
		
	}

}
