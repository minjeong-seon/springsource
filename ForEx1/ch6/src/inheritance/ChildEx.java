package inheritance;

public class ChildEx {

	public static void main(String[] args) {
		Child2 child2 = new Child2();
		
		child2.method1();  //상속받은 거(부모)
		child2.method2();  //내꺼 Child2
		child2.method3();  //내꺼 Child2

	}

}
