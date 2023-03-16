package ch6;

public class MemberEx {

	public static void main(String[] args) {
		Member member1 = new Member("hong123","h1004","h1004","서울","01022223333");
		Member member2 = new Member("kong007","k007","k001","부산","01012345678");
		
		//true라면 비번 일치
		//false라면 비번 확인 부탁 메시지 출력
		if (member1.pwandconfirmPwEquals()) {
			System.out.println("비밀번호가 일치합니다.");
		}else {
			System.out.println("비밀번호를 확인해주세요.");
		}
		System.out.println(member2.pwandconfirmPwEquals()
				?"비밀번호가 일치합니다.":"비밀번호가 일치하지 않습니다.");

		//member1과 2의 주소에 입력된 값 출력하기(밑에서 static으로 묶은거)
		memberInfo(member1);
		memberInfo(member2);
	}

	//반복되는 출력문 메소드(속성)로 묶어서 편하게 출력하기
	//==> 메소드 매개변수명(클래스명 멤버변수명){}
	//(TvEx, DataExMay 참고)
	static void memberInfo(Member member) {
		System.out.println("아이디: "+member.id);
		System.out.println("비밀번호: "+member.pw);
		System.out.println("전화번호: "+member.hp);
		System.out.println("주소: "+member.address);
	}
	
//static 없이 하려면 new를(인스턴스화) 따로 진행해야 함
	
	/*MemberEx abc = new MemberEx();
	 * abc.memberInfo(member1)
	 * abc.memberInfo(member2)
	 * 
	 * void memberInfo(Member member) {
		System.out.println("아이디: "+member.id);
		System.out.println("비밀번호: "+member.pw);
		System.out.println("전화번호: "+member.hp);
		System.out.println("주소: "+member.address);
	 * 
	 */
}
