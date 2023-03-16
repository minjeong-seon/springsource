package shop;

import java.util.Scanner;

public class MyShop implements IShop {

	//shop이름
	private String title;
	//user 정보 저장 배열
	User[] users = new User[2];
	Product[] products = new Product[4];
	
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void setTitle(String title) {
		this.title=title;
	}

	@Override
	public void genUser() {
		//user 2명 생성 후 배열에 저장
		users[0] = new User("홍길동", PayType.CARD);
		users[1] = new User("성춘향", PayType.CASH);
	}

	@Override
	public void genProduct() {
		//Product 4개 생성 후 배열에 저장
		products[0]=new CellPhone("갤럭시2", 100, "SK");
		products[1]=new CellPhone("아이폰1", 130, "KT");
		products[2]=new SmartTv("삼성티비", 500, "UHD");
		products[3]=new SmartTv("엘지올레드", 700, "UHD");
	}

	@Override
	public void start() {
		System.out.println(title+" : 메인화면 - 계정 선택");
		System.out.println("=========================");
		for (int i = 0; i < users.length; i++) {
			System.out.println("["+i+"]"+users[i].getName()+"("+users[i].getPayType()+")");
			//System.out.printf("[%d]%s(%s)\n",i,users[i].getName(),users[i].getPayType());
		}
		System.out.println("[X]종 료");
		System.out.print("선택 : ");
		String sel = sc.nextLine();
		System.out.println("## "+sel+" 선택 ##");
		System.out.println();  //enter
		
		//0이나 1을 누르면 productList(); 호출
		//다른 걸 입력시: 메뉴를 확인해 주세요 출력
		switch (sel) {
		case "x": case "X":
			System.exit(0);  //프로그램 종료
			break;
		case "0": case "1":
			productList();
			break;
		default:
			System.out.println("메뉴를 확인해 주세요.\n");
			start();
			break;
		}
		
	}
	public void productList() {
		
	}

}
