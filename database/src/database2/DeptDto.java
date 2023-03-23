package database2;

// 클래스간 데이터 전달을 위해 사용하는 객체
// ~~DTO(Data Transfer Object)
// ~~VO(Value Object)

// DB 데이터 내용을 전송하기 위해 사용
// =>table 컬럼과 동일하게 작성
// default 생성자, 생성자, getset 메소드, toString 메소드

//rs에 담긴 내용을 dto 로 가져오기
public class DeptDto {
	private int deptno;
	private String dname;
	private String loc;
	
	public DeptDto() {
		super();
		
	}

	public DeptDto(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
	@Override
	public String toString() {
		return "DeptDto [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	
}
