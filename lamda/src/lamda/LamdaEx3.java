package lamda;

public class LamdaEx3 {
	public static void main(String[] args) {
		Lamda3 lamda = (x) -> System.out.println(x);
		lamda.method(150);
		
		lamda = (x) -> {
			int i = 10;
			System.out.println(i*x);
		};
		lamda.method(100);
		
		
		
		
		
		
		
	}
}
