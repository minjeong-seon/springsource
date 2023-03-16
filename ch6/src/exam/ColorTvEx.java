package exam;
//Tv 상속받아 ColorTv 클래스 생성 및 작성

//ColorTv 상속 받아 IpTv 클래스 생성 및 작성

public class ColorTvEx {

	public static void main(String[] args) {
		ColorTv myTv = new ColorTv(32, 1024);

		myTv.printProperty();
		
		//실행결과: 32인치, 1024컬러

		IpTv ipTv = new IpTv(32,2048,"192.1.1.2");
		ipTv.printProperty();  //나의 IpTv는 32인치, 2048컬러, 주소는 192.1.1.2입니다.
	}
	
}
