package shop;
//상수만 가질 수 있으며, 모든 메소드는 추상메소드
public interface IShop {
	//public static abstract 자동
	void setTitle(String title);
	void genUser();
	void genProduct();
	void start();
}

