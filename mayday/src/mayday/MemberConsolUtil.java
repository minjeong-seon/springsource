package mayday;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberConsolUtil {

	//-------------[1]회원 등록--------------
	public Member getNewMember(Scanner sc) {
		System.out.println("고객 ID: ");
		String id = sc.nextLine();
		System.out.println("고객 성함: ");
		String name = sc.nextLine();
		System.out.println("고객 주소: ");
		String address = sc.nextLine();
		System.out.println("고객 email: ");
		String email = sc.nextLine();
		System.out.println("고객 나이: ");
		int  age= Integer.parseInt(sc.nextLine());
		
		Member member = new Member(id, name, address, email, age);
		return member;
	}
	
	public void printAddSuccessMessage(Member member) {
		System.out.println(member.getName()+" 님이 회원으로 등록되었습니다.");
	}
	
	//-------------[2]회원 목록--------------
	public void printMemberList(ArrayList<Member> list) {
		System.out.println("아이디 이름 주소 이메일 나이");
		for (Member member : list) {
			System.out.printf("%s %s %s %s %d",member.getId(),member.getName(),member.getAddress(),member.getEmail(),member.getAge());
			System.out.println();
		}
	}
	
	//-------------[3]회원 정보 수정--------------
	public Member updateMember(Scanner sc,ArrayList<Member> list) {
		//수정할 회원의 아이디 입력받기
		System.out.println("고객 ID: ");
		String id = sc.nextLine();
		//입력받은 정보가 회원 목록과 일치하는지 확인
		for (Member member : list) {
			if (member.getId().equals(id)) {
				//입력받은 정보로 주소 변경
				System.out.println("변경할 주소 입력: ");
				String address = sc.nextLine();
				member.setAddress(address);
				System.out.println(member.getName()+" 님의 주소가 변경되었습니다.");
				//수정된 회원 정보 리턴
				return member;
			}
		}
		//일치하는 회원이 없다면
		return null;
	}
	
	public void printUpdateFailMessage() {
		System.out.println("일치하는 정보가 없습니다. ID를 다시 확인해 주세요.");
	}
	
	//-------------[4]회원 정보 삭제--------------
	public Member removeMember(Scanner sc,ArrayList<Member> list) {
		//삭제할 회원 아이디 입력받기
		System.out.println("회원 ID: ");
		String id = sc.nextLine();
		//삭제할 회원 아이디 존재여부 확인
		for (Member member : list) {
			if (member.getId().equals(id)) {
				//존재하면 삭제+삭제된 회원 리턴
				System.out.println("회원 탈퇴 처리되었습니다.");
				list.remove(member);
				return member;
			}
		}
		//존재하지 않으면 null 리턴
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
