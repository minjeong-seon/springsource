package thread;

public class User extends Thread{
	//포함관계(has a)
	private Calcultor cal;
	
	
	
	public User(Calcultor cal) {
		super();
		this.cal = cal;
		setName("User1");
	}

	@Override
	public void run() {
		cal.setMemory(100);
	
 }
}
