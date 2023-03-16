package thread;

public class Calcultor {
	private int memory;

	public int getMemory() {
		return memory;
	}

	//synchronized: 동기화 메소드
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		
		try {
			Thread.sleep(2000);		//2초 지연
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+": "+this.memory);
	}
	
}
