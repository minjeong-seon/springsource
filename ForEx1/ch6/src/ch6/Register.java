package ch6;
//특문: ※ → ← ▼ ◀ ▶ ▲
public class Register {
	String user;
	String password;
	String mobile;   //←필수 요소는 아닌 걸로==선택사항
	
	public Register(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}

	public Register(String user, String password, String mobile) {
		super();
		this.user = user;
		this.password = password;
		this.mobile = mobile;
	}
	
	
}
