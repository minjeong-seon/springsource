package register;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//----------------------------1번 회원등록 메뉴---------------------------
public class MemberConsolUtil {
	public Member getNewMember(Scanner sc) {
		//새로운 멤버 정보를 입력받기
		System.out.print("아이디 >> ");
		String id=sc.nextLine();
		
		System.out.print("이름 >> ");
		String name=sc.nextLine();
		
		System.out.print("주소 >> ");
		String address=sc.nextLine();
		
		System.out.print("이메일 >> ");
		String email=sc.nextLine();
		
		System.out.print("나이 >> ");
		int age=Integer.parseInt(sc.nextLine());
	
		return new Member(id, name, address, email, age);		//리턴값 객체 생성
	}
	
	public void printAddSuccessMessage(Member member) {
		// 홍길동님 회원 정보 추가 성공 메시지 출력
		System.out.println(member.getName()+" 님 회원 등록 완료");
	}
	
	//----------------------2번 회원목록 메뉴---------------------------
	public void printMemberList(ArrayList<Member> list) {
		//list에 들어있는 member 출력
		//System.out.println(list.toString());
		System.out.println("아이디  이름   주소    이메일     나이");
		for (Member member : list) {
			System.out.printf("%5s", member.getId());
			System.out.printf("%6s", member.getName());
			System.out.printf("%8s", member.getAddress());
			System.out.printf("%10s", member.getEmail());
			System.out.printf("%5d", member.getAge());
			System.out.println();
		}
	}
		
	//	----------------------3번 회원 정보 수정 메뉴---------------------------
	public Member updateMember(Scanner sc, ArrayList<Member> list) {
		//수정할 회원의 아이디 입력받기
		System.out.println("아이디 >> ");
		String id=sc.nextLine();
	
		for (int i = 0; i < list.size(); i++) {
			Member member = list.get(i);
			//회원이 존재한다면 변경할 주소 입력받기
			if (member.getId().equals(id)) {
				//입력받은 정보로 주소 변경
				System.out.print("변경할 주소 >> ");			
				String address = sc.nextLine();
				member.setAddress(address);
				//수정된 회원 정보 리턴
				return member;
			}//일치하는 회원이 없다면
		}return null;
	}
	
	
	public void printUpdateSuccessMessage(Member member) {
		//##님 회원 정보 수정 완료 메시지 출력
		System.out.println(member.getName()+" 님 회원정보 수정이 완료되었습니다.");
	}
	
	public void printUpdateFailMessage() {
		//회원 정보 수정 실패 메시지 출력
		System.out.println("아이디를 확인해 주세요.");
	}
	
	
	//	----------------------4번 회원 정보 삭제 메뉴---------------------------
	public Member removeMember(Scanner sc, ArrayList<Member> list) {
		//삭제할 회원 아이디 입력받기
		System.out.print("아이디 >> ");
		String id = sc.nextLine();
		//삭제할 회원 아이디 존재여부 확인
		for (Member member : list) {
			//존재하면 삭제+삭제된 회원 리턴
			if (member.getId().equals(id)) {
				System.out.println("계정이 삭제되었습니다.");
				list.remove(member);
				return member;
			}
		}
		//존재하지 않으면 null 리턴
		return null;
	}
	
	
	
	
	
	
	
}

