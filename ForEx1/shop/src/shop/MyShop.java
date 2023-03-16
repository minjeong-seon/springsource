package shop;

import java.util.Scanner;

public class MyShop implements IShop {

	//shop이름
	private String title;
	//user 정보 저장 배열
	User[] users = new User[2];
	Product[] products = new Product[4];
	//구매한 제품을 저장할 배열(cart)
	Product carts[] = new Product[10];
	//start();에서 선택된 user 정보를 저장할 변수 선언
	private int selUser;
	
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
			//입력받은 숫자로 selUser변수에 유저 정보 저장
			selUser=Integer.parseInt(sel);
			
			productList();
			break;
		default:
			System.out.println("메뉴를 확인해 주세요.\n");
			start();
			break;
		}
		
	}

	public void productList() {
		System.out.println();
		System.out.println(title+" : 상품목록 - 상품 선택");
		System.out.println("=========================");
		for (int i = 0; i < products.length; i++) {
			System.out.printf("[%d]",i);
			products[i].printDetail();
			products[i].printExtra();	
			System.out.println();
		}
		System.out.println("[h] 메인 화면");
		System.out.println("[c] 체크 아웃");
		System.out.print("선택 : ");
		String sel = sc.nextLine();

		//상품선택:0~3번(cart에 제품 추가+productList 호출) | 메뉴선택: h(start 호출),c(checkOut 호출)
		switch (sel) {
		case "0":case "1":case "2":case "3":
			for (int i = 0; i < carts.length; i++) {
				if (carts[i]==null) {
					//Integer.parseInt("0") ==> int 0으로 인식하겠다는 코드 
					carts[i]=products[Integer.parseInt(sel)];
					break;
				}
			}
			productList();
			break;
		case "h":case "H":
			start();
			break;
		case "c":case "C":
			checkOut();
			break;
		default:
			System.out.println("입력값을 확인해 주세요.");
			productList();
			break;
		}
	}
	
	public void checkOut() {
		//장바구니에 담겨있는 상품 목록 출력
		//가격 합계 구하기
		//결제방법: card/cash
		//결제금액: 얼마얼마
		//[p] 이전, [q] 결제완료
		System.out.println();
		System.out.println("=========================");
		int sum = 0;
		for (int i = 0; i < carts.length; i++) {
			if (carts[i]!=null) {
				//장바구니에 담긴 상품을 모두 확인할 수 있어야 하므로 break를 걸지 않는다.
				System.out.printf("[%d]%s(%d)\n",i,carts[i].getName(),carts[i].getPrice());
				sum+=carts[i].getPrice();
			}
		}System.out.println("=========================");
		System.out.println("결제 방법: "+users[selUser].getPayType());
		System.out.println("합계: "+sum+"만원");
		System.out.println("[p]이전 , [q]결제완료");
		System.out.print("선택 : ");
		String sel=sc.nextLine();
		
		//p일 때 productList() 호출
		//q일 때 "결제가 완료되었습니다." + 프로그램 종료
		//잘못 입력 시 다시 checkOut() 호출
		
		switch (sel) {
		case "p":case "P":
			productList();
			break;
		case "q":case "Q":
			System.out.println("결제가 완료되었습니다.");
			System.exit(0);
		default:
			System.out.println("입력값을 확인해 주세요.");
			checkOut();
			break;
		}
	}
	
	
}
