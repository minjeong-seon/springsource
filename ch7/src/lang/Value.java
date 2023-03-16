package lang;

public class Value {
	int Value;

	public Value(int value) {
		super();
		Value = value;
	}

	//Object가 Equals를 주소 비교로 넘겨줌 >> 값 비교로 바꾸고자 재정의
	@Override
	public boolean equals(Object obj) {
		//instanceof: 특정 객체의 인스턴스인지 확인
		//obj가 Value 객체의 인스턴스인가? 
		if (obj instanceof Value) {
			Value v = (Value) obj;
			if (this.Value==v.Value) {
				return true;
			}
		}return false;
	}

	
	// toString() : Object는 패키지명.클래스명@Hashcode값 출력
	// 자식 toString() : 인스턴스에 대한 정보를 문자열로 제공하는 목적으로 사용
	
	@Override
	public String toString() {
		return "Value [Value=" + Value + "]";
	}
}
