package lamda;

public class LamdaEx4 {
	public static void main(String[] args) {
		
		Lamda4 lamda = (x,y) -> x > y ? x : y;
		System.out.println("x와 y 중 큰 수: "+lamda.max(150,100));
		

		Lamda5 lamda2 = (x,y) -> x < y ? x : y;
		System.out.println("x와 y 중 작은 수: "+lamda2.min(150,100));
		
		
		
		
		
		
	}
}
