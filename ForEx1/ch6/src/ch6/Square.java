package ch6;

public class Square {
	//속성: 한 변
	double side;
	
	public Square(double side) {
		super();
		this.side = side;
	}

	//기능: 넓이
	//넓이=한 변*한 변
	double getArea() {
		return side*side;
	}
}
