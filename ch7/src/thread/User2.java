package thread;

public class User2 extends Thread{
	//포함관계(has a)
	private Calcultor cal;
	
	public User2(Calcultor cal) {
		super();
		this.cal = cal;
		setName("User2");
	}

	@Override
	public void run() {
		cal.setMemory(50);
	
 }
}
