package shop;

public class CellPhone extends Product{

	String carrier;
	
 public CellPhone(String name, int price, String carrier) {
		super(name, price);
		this.carrier=carrier;
	}



 
 
 
//통신사 정보를 출력하는 메소드
@Override
public void printExtra() {
	System.out.println("통신사 정보: "+carrier);
	
}
 
}
