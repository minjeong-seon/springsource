package shop;

import java.awt.Label;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//배열로 선언된 부분 => ArrayList로 변경(프로그램 수정하기)
public class MyShop2 implements IShop {

	//shop이름
	private String title;
	//start();에서 선택된 user 정보를 저장할 변수 선언
	private int selUser;
		//user 정보 저장 배열
	//구매한 제품을 저장할 배열(cart)
		ArrayList<User> users=new ArrayList<>();
		ArrayList<Product> products=new ArrayList<>();
		ArrayList<Product> carts=new ArrayList<>();

	Scanner sc=new Scanner(System.in);
	
	@Override
	public void setTitle(String title) {
		this.title=title;
	}

	@Override
	public void genUser() {
		//user 2명 생성 후 배열에 저장
		users.add(new User("홍길동",PayType.CARD));
		users.add(new User("성춘향",PayType.CASH));
	}

	@Override
	public void genProduct() {
		//Product 4개 생성 후 배열에 저장
		products.add(new CellPhone("갤럭시2", 100, "SK"));
		products.add(new CellPhone("아이폰1", 130, "KT"));
		products.add(new  SmartTv("삼성티비", 500, "UHD"));
		products.add(new SmartTv("엘지올레드", 700, "UHD"));
	}

	@Override
	public void start() {
		System.out.println(title+" : 메인화면 - 계정 선택");
		System.out.println("=========================");
		int i=0;
		for (User user : users) {
			System.out.printf("[%d] %s(%s)\n",i++,user.getName(),user.getPayType());
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
	
		int i=0;
		for (Product product : products) {
			System.out.printf("[%d]",i++);
			product.printDetail();
			product.printExtra();	
			System.out.println();
		}
		System.out.println("[h] 메인 화면");
		System.out.println("[c] 체크 아웃");
		System.out.print("선택 : ");
		String sel = sc.nextLine();

		//상품선택:0~3번(cart에 제품 추가+productList 호출) | 메뉴선택: h(start 호출),c(checkOut 호출)
		switch (sel) {
		case "0":case "1":case "2":case "3":
			carts.add(products.get(Integer.parseInt(sel)));
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
		int total = 0;
		int i=0;
		for (Product cart : carts) {
			if (carts!=null) {
				System.out.printf("[%d]%s(%d)\n",i++,cart.getName(),cart.getPrice());
				total+=cart.getPrice();
		}
	
		}System.out.println("=========================");
		System.out.println("결제 방법: "+users.get(selUser).getPayType());
		System.out.println("합계: "+total+"만원");
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
