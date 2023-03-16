package thread;

public class UserMain {
	public static void main(String[] args) {
		
		Calcultor cal=new Calcultor();
		
		User user1 = new User(cal);
		User2 user2 = new User2(cal);
		
		user1.start();
		user2.start();

	}

}
