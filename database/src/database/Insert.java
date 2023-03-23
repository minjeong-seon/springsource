package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.print.DocFlavor.URL;

public class Insert {
	public static void main(String[] args) {
		// insert, update, delete 작업 시에는 con, pstmt 두 개의 객체만 사용
		// DML 작업 시 성공한 행의 개수만 전달받게 됨
		Connection con = null;
		PreparedStatement pstmt = null;
		
		
		try {
			//드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			//연결
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="scott";
			String password="TIGER";
			
			//자바에서 오라클db  작성 시 바로 commit이 됨
			con=DriverManager.getConnection(url, user, password);
			
			//sql 구문 작성
			String sql = "insert into dept_temp (deptno, dname, loc) values (55,'NETWORK', 'SEOUL')";
			//sql 구문 eclipse > sql developer 전송하기
			pstmt = con.prepareStatement(sql);
			//select : executeQuery(), DML : executeUpdate()
			int count = pstmt.executeUpdate();
			if (count>0) {
				System.out.println("입력 성공");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}

	}
	
	
	
	
	

}
