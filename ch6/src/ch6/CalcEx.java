package ch6;
//특문: ※ → ← ▼ ◀ ▶ ▲
public class CalcEx {

	public static void main(String[] args) {
		//사칙연산
		//클래스 사용 ==>객체 생성
		Calc1 calc=new Calc1();

		//메서드 호출
		//	→메서드 원형에 맞춰 호출 : 클래스에서 매개변수가 있는 메서드를 입력했으므로 똑같은 구조로 호출
		//  →But, 메서드가 void타입이 아닌 경우 : 리턴타입에 대한 준비 필요
			//→→ 1)출력문에 넣어서 출력하기
			//→→ 2)변수에 받기
		
		//덧셈 메서드 호출 한줄로 뚝딱
		System.out.println("1+2="+calc.add(1,2)); //←←1)출력문에 넣어서 출력하기
		
		int sum=calc.add(1, 2);  //←←2)변수에 받기 
		sum+=30;  // ←←변수에 받고 다른 작업 추가 진행해도 됨
		System.out.println("니가 입력한 수 +30 = "+sum);
		
		//클래스에 있는 다른 메서드 호출하기
		System.out.println("1-2="+calc.subtrack(1, 2));
		System.out.println("1*2="+calc.multiple(1, 2));
		System.out.println("1/2="+calc.division(1, 2));

		
	}
}
