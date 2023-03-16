package register;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MemberUi {
	public static void main(String[] args) {
		
		boolean isStop = false;
		Scanner sc = new Scanner(System.in);
		
		MemberConsolUtil util = new MemberConsolUtil();
		ArrayList<Member> list = new ArrayList<>();		//회원정보 담을 객체
		
		//선언
		Member member = null;
		do {
			System.out.println();
			System.out.println("===========회원관리 프로그램===========");
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 목록 보기");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 프로그램 종료");
			System.out.println("==================================");
			
			System.out.print("메뉴번호 >> ");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
				member = util.getNewMember(sc);
				//넘겨받은 리턴값을 list에 추가
				list.add(member);
				util.printAddSuccessMessage(member);
				break;
			case 2:
				util.printMemberList(list);
				break;
			case 3:
				member =util.updateMember(sc, list);
				if (member!=null) {
					util.printUpdateSuccessMessage(member);
				} else {
					util.printUpdateFailMessage();
				}
				break;
			case 4:
				member = util.removeMember(sc,list);
				if (member==null ) {
					util.printUpdateFailMessage();
				} 
				break;
			case 5:
				isStop = true;
				break;
			default:
				break;
			}
					
		}while(!isStop);

	
	
	
	
	
	}

}
