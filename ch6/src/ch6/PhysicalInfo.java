package ch6;
//특문: ※ → ← ▼ ◀ ▶ ▲

public class PhysicalInfo {
	//생성자 오버로딩
	//오버로딩(;overloading): 한 클래스에 동일한 이름의 메소드/생성자가 존재하는 것
	
	String name;
	int age;
	float height;
	float weight;
	
	
	//생성자 오버로딩
	//		:생성자 이름은 같아야 함
	//		:매개변수의 개수 또는 타입이 달라야 함
	
	public PhysicalInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public PhysicalInfo(String name, int age, float height, float weight) {
//		super();
//		this.name = name;
//		this.age = age;
		this(name, age);  //생성자에서 다른 생성자를 호출(위에 있는 생성자)
		//▲메소드 아래 가장 첫 줄(first statement)에만 불러올 수 있다.  (※car3에 복습)
		this.height = height;
		this.weight = weight;
	}


	public PhysicalInfo(int age, String name, float height, float weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public PhysicalInfo(float height, float weight) {
		super();
		this.height = height;
		this.weight = weight;
	}


	
	
	
	
	
	
	
	
	
}
