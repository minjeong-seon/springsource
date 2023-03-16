package lang;

//Math 클래스: 기본적인 수학계산에 유용한 메소드로 구성
// 생성자가 없음(인스턴스화 불가): 모든 메소드/필드가 static이다.

public class MathEx1 {
	public static void main(String[] args) {
		Math math;
		
		System.out.println(Math.E);
		System.out.println(Math.PI);

		
		//반올림, 올림, 버림
		double val = 90.7552;

		//round(double): 반올림
		System.out.println("round("+val+")="+Math.round(val));
		
		val*=100;
		System.out.println("round("+val+")="+Math.round(val));
		
		System.out.println("round("+val+")/100="+Math.round(val)/100);
		System.out.println("round("+val+")/100.0="+Math.round(val)/100.0);
		System.out.println();
		
		//실수: %3.1f --> 출력 시 전체 자릿수는 3자리, 소숫점은 첫째자리까지
		//ceil(): 올림
		System.out.printf("ceil(%3.1f)=%3.1f\n",12.1,Math.ceil(12.1));
		
		//floor(): 버림
		System.out.printf("ceil(%3.1f)=%3.1f\n",1.5,Math.floor(1.5));
		
		
		//max(): a,b 두 수 중 큰 수 출력
		System.out.println("13과 130.9 중 큰 수: "+Math.max(13, 130.9));
		System.out.printf("max(%d, %f) = %f\n",13,130.9,Math.max(13, 130.9));
		//min(): a,b 두 수 중 작은 수 출력
		System.out.printf("min(%d,%f) = %f\n", 13, 130.9, Math.min(13, 130.9));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
