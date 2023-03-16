package poly;

public class EmployeeEx2 {

	public static void main(String[] args) {
//		Employee employee = new Employee();
//		employee.setName("홍길동");
//		employee.setPosition("사원");
//		//employee.work();
//		workPrint(employee);
		
		//메소드가 오버라이딩 되었다면 오버라이딩 된 메소드가 실행됨*
		Ceo employee2 = new Ceo();
		employee2.setName("김동호");
		employee2.setPosition("CEO");
		workPrint(employee2);
		
		AdminStrator employee3 = new AdminStrator();
		employee3.setName("정우성");
		employee3.setPosition("Admin");
		workPrint(employee3);
		
		PartTime employee4 = new PartTime();
		employee4.setName("성춘향");
		employee4.setPosition("파트타임");
		workPrint(employee4);
	
	}

	//매개변수의 다형성: (부모타입 매개변수){}로 하면 메소드가 다형성이 아니더라도 static 적용 가능
	static void workPrint(Employee employee) {
		employee.work();
	}
	
	
	
}
