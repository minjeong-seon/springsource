package shop2;

import java.sql.Array;
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
		ArrayList<UserDTO> users =new ArrayList<>();
		ArrayList<Product> products=new ArrayList<>();
		ArrayList<Product> carts=new ArrayList<>();

	//UserDAO 객체 생성
	UserDAO userDAO = new UserDAO();
	ProductDAO productDAO = new ProductDAO();
	
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void setTitle(String title) {
		this.title=title;
	}

	@Override
	public void genUser() {
		//user 정보 입력받아서 suser 테이블에 저장
		System.out.println("***** User 입력 *****");
		System.out.println("USER ID 입력 : ");
		int user_id = Integer.parseInt(sc.nextLine());
		System.out.println("USER 이름 입력 : ");
		String name = sc.nextLine();
		System.out.println("결제수단 1. Card | 2. Cash");
		int pay_no = Integer.parseInt(sc.nextLine());
		System.out.println(userDAO.insert(user_id, name, pay_no)? "user 추가 완료" : "user 추가 실패");
	}

	
	public void userList() {
		System.out.println("***** User 목록 *****");
		System.out.println("USER ID  |   NAME  |  PAYTYPE");
		System.out.println("----------------------------------");
		List<UserDTO> list = userDAO.getList();
		for (UserDTO userDTO : list) {
			System.out.print(userDTO.getUser_id()+"\t");
			System.out.print(userDTO.getName()+"\t");
			System.out.print(userDTO.getPayNo()+"\n");
		}
	}
	
	
	@Override
	public void genProduct() {
		//상품 정보 입력받아서 테이블 저장
		System.out.println("***** 상품정보 입력 *****");
		ProductDTO dto = new ProductDTO();
		System.out.println("상품ID 입력 : ");
		dto.setProduct_id(Integer.parseInt(sc.nextLine()));
		System.out.println("상품명 입력 : ");
		dto.setPname(sc.nextLine());
		System.out.println("상품가격 입력 : ");
		dto.setPrice(Integer.parseInt(sc.nextLine()));
		System.out.println("REMARK : ");
		dto.setContent(sc.nextLine());
		//상품정보 입력받아서 ProductDTO에 담기
		System.out.println(productDAO.insert(dto) ? "상품 등록 완료" : "상품 등록 실패");
		
	}

//	System.out.println("***** 상품 목록 *****");
//	System.out.println("상품 ID  |   상품명  |  가격  |  상품상세");
//	System.out.println("----------------------------------");
	
	@Override
	public void start() {
		System.out.println(title+" : 메인화면 - 계정 선택");
		System.out.println("=========================");
		int i=0;
		for (UserDTO user : users) {
			//System.out.printf("[%d] %s(%s)\n",i++,user.getName(),user.getPayType());
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
		//System.out.println("결제 방법: "+users.get(selUser).getPayType());
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
