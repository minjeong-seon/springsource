package ch6;
//특문: ※ → ← ▼ ◀ ▶ ▲

//메소드는 위에서 아래로 실행됨

public class DataEx {
	//1)처음 실행되는 메인 메소드
	public static void main(String[] args) {
		Data data=new Data();

		//초기화(직접접근)---1-1)
		data.x=10;
		System.out.println("main() : x = "+data.x);
		
		//값이 넘어감(점찍은 거)---1-2)
		Change(data.x);
		System.out.println("After Change(data.x)");
		System.out.println("main() : x = "+data.x);
	
		//주소가 넘어감---1-3)
		Change2(data);
		System.out.println("After Change2(data.x)");
		System.out.println("main() : x = "+data.x);
		
	}   //main메소드 끝나는 범위
	
	//2)기본형 매개변수: 값만 받음
	static void Change(int x) {   //1-2)에서 값을 넘겨받았으므로 매개변수(호출할 값) 입력
		x=1000; //---2-1)
		System.out.println("Change() : x = "+x);
		
		}
		
	//3)참조형 매개변수: 값을 읽고 수정 가능
	static void Change2(Data d) {   //1-3)에서 주소를 넘겨받았으므로 멤버변수(변수 명) 입력
		d.x=1000;
		System.out.println("Change2() : x = "+d.x);
		
		}

	
	}

