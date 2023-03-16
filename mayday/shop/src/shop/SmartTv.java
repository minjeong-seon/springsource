package shop;

public class SmartTv extends Product{

	String resolution;

	 public SmartTv(String name, int price, String resolution) {
		super(name, price);
		this.resolution=resolution;
	}
	//해상도 정보를 출력하는 메소드
	@Override
	public void printExtra() {
		System.out.println("해상도 정보: "+resolution);
		
	}
	 
	
	
			
		
}
