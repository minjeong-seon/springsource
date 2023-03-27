package database2;


import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@어쩌고 자동완성으로 lombok이 아웃라인에 메소드 생성해줌
//@NoArgsConstructor : 기본생성자, @AllArgsConstructor : 생성자
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class EmpDTO {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hirdate;
	private int sal;
	private int comm;
	private int deptno;
	
	
}
