package database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// ~DAO : database 작업을 담당하는 클래스를 의미

public class DeptDao {
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	//커넥션을 위한 드라이버 로드
	static {	//static으로 잡아서 첫 번째로 실행되도록 설정
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//커넥션을 리턴하는 메소드
	public Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "TIGER";
		
		try {
			con = DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
	//close() : 자원닫기
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void close(Connection con, PreparedStatement pstmt) {
		try {
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//select-하나 가져오기
	public DeptDto getRow(int deptno) {
		//커넥션 가져오기(위에 만든 메소드 호출)
		con = getConnection();
		String sql = "select * from dept_temp where deptno=?";
		DeptDto dto = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			rs=pstmt.executeQuery();
			if (rs.next()) {
// 아래 4가지 방법으로  rs => deptDto에 담기 가능(1) 출력문은 DeptDto에 담기x)				
// 1)			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));

// 2)			deptno = rs.getInt(1);
//				String dname = rs.getString(2);
//				String loc = rs.getString(3);
//				
//    			dto = new DeptDto(deptno, dname, loc);
				
// 3)			return new DeptDto(rs.getInt(1), rs.getString(2),rs.getString(3));

// 4)				
				dto = new DeptDto();
				dto.setDeptno(rs.getInt(1));
				dto.setDname(rs.getString(2));
				dto.setLoc(rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		return dto;
	}	
	
	//select-All
	public ArrayList<DeptDto> getRows() {
		//여러 개의 행을 리스트에 담고 리스트를 리턴
		ArrayList<DeptDto> list = new ArrayList<>();
		
		try {
			con = getConnection();
			String sql = "select*from dept_temp";
			//실행할 sql 구문 보내기
			pstmt = con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while (rs.next()) {
// 1)			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
				
// 2)			int deptno = rs.getInt(1);
//				String dname = rs.getString(2);
//				String loc = rs.getString(3);
//				DeptDto dto = new DeptDto(deptno, dname, loc);
//				
//				list.add(dto);
				
// 3)			list.add(new DeptDto(rs.getInt(1), rs.getString(2),rs.getString(3)));
			
// 4)				
					DeptDto dto = new DeptDto();
					dto.setDeptno(rs.getInt(1));
					dto.setDname(rs.getString(2));
					dto.setLoc(rs.getString(3));
					list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		return list;
	}
	
	//insert-출력문이 필요한 방식(main 클래스 1번 방법*)
	public boolean insert(int deptno, String dname, String loc) {
		boolean status = false;	//inset 성공여부
		try {
			con=getConnection();
			String sql = "insert into dept_temp(deptno, dname, loc) values(?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			pstmt.setString(2, dname);
			pstmt.setString(3, loc);
			int result = pstmt.executeUpdate();
			if (result>0) status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt);
		}
		return status;
	}
	
	
	//insert-dto를 받아서 전송하는 방식(main 클래스 2번 방법*)
	public boolean insert(DeptDto dto) {
		boolean status = false;	//inset 성공여부
		try {
			con=getConnection();
			String sql = "insert into dept_temp(deptno, dname, loc) values(?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, dto.getDeptno());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());
			int result = pstmt.executeUpdate();
			if (result>0) status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt);
		}
		return status;
	}
	
	
	//update
	public boolean update(String value, int deptno, int updateNo) {
		boolean status = false;
		String sql=null;	// 수정은 1. 부서명 수정, 2. 위치 수정 두 가지이므로 여러번 써먹게 객체생성
		try {
			con=getConnection();
			if (updateNo==1) {
				//부서 수정
				sql = "update dept_temp set dname = ? where deptno = ?";
			}else if (updateNo==2) {
				//위치 수정
				sql = "update dept_temp set loc = ? where deptno = ?";
				}
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, value);
			pstmt.setInt(2, deptno);
			
			int result = pstmt.executeUpdate();
			if(result>0) status=true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			close(con, pstmt);
		}
		return status;
	}
	
	//delete
	public boolean remove(int deptno) {
		boolean status = false;
		try {		//deptno 일치하는 부서 삭제
			String sql = "delete from dept_temp where deptno=?";
			con=getConnection();
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			
			int result = pstmt.executeUpdate();
			if(result>0) status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt);
		}
		return status;
	}
	
	
	
	
	
}
