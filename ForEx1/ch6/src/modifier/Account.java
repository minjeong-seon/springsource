package modifier;

public class Account {
	//속성(멤버/인스턴스 변수): 대부분 private로 막는다
	//		==> 외부에선 속성에 직접 접근 불가
	//	인스턴스 변수의 값을 얻거나 변경하고 싶을 때? >> 메소드로 처리
	//		 ==> getters & setters 메소드 활용
	
	private String ano;

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}
	
}
