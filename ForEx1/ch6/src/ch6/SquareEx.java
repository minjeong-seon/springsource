package ch6;

public class SquareEx {

	public static void main(String[] args) {
		Square square1=new Square(5);
		System.out.println("정사각형의 넓이: "+square1.getArea()+"cm");
		
		Square square2=new Square(7.3);
		System.out.println("정사각형의 넓이: "+square2.getArea()+"cm");
		
		Square square3=new Square(19);
		System.out.println("정사각형의 넓이: "+square3.getArea()+"cm");
	}

}
