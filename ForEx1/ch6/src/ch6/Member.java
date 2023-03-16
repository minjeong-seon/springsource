package ch6;

public class Member {
	//속성: 아이디 id, 비밀번호 pw, 비밀번호 확인 confirmPw,전화번호 hp (-특문없이), 주소 address
	String id, pw, confirmPw, address,hp;
	
	public Member(String id, String pw, String confirmPw, String address, String hp) {
		super();
		this.id = id;
		this.pw = pw;
		this.confirmPw = confirmPw;
		this.address = address;
		this.hp = hp;
	}
	
	
	public Member(String id, String pw, String confirmPw, String hp) {
		super();
		this.id = id;
		this.pw = pw;
		this.confirmPw = confirmPw;
		this.hp = hp;
	}


	
	//문자열 비교는 ==아니고 Equals 사용
	boolean pwandconfirmPwEquals () {
		return pw.equals(confirmPw);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
