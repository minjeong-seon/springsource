package thread;

public class ThreadEx5 {
	public static void main(String[] args) {
		CalcTrhead t1 = new CalcTrhead();
		CalcTrhead2 t2 = new CalcTrhead2();
		
		//우선순위 : 숫자가 높을수록 우선순위 높음 (*최대 우선순위: 10*)
		//getPriority(): Returns this thread's priority.
		//main에서 생성한 쓰레드는 자동적으로 우선순위가 5로 setting됨
		t2.setPriority(7);
		
		System.out.println("t1(-) 우선순위 "+t1.getPriority());
		System.out.println("t2(|) 우선순위 "+t2.getPriority());
		
		t1.start();
		t2.start();
		
	}

}
