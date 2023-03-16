package ch6;

public class NumbersEx {
	public static void main(String[] args) {
		int num[]= {1,10,100,1000,10000};
		Numbers numbers=new Numbers(num);
		
		System.out.println("배열총합: "+numbers.getTotal());
		System.out.println("배열평균: "+numbers.getAverage());
		
		
		
		
		
		
}
}