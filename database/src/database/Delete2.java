package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//사용자로부터 입력을 받아 db 테이블 내 특정 행 삭제
import java.util.Scanner;

public class Delete2 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user="scott";
			String password="TIGER";
			
			con = DriverManager.getConnection(url,user,password);
			
			System.out.println("삭제할 부서번호 입력 >> ");
			int deptno = sc.nextInt();
			
			//사용자가 입력한 deptno 값 삭제
			//String sql = "delete from dept_temp where deptno="+deptno;
			
			String sql = "delete from dept_temp where deptno=?";
			
			pstmt = con.prepareStatement(sql);
			//?에 들어갈 내용 세팅: setInt(1, deptno); - sql 구문에 있는 첫 번째 ?에 deptno를 대입
			pstmt.setInt(1, deptno);
			
			int result = pstmt.executeUpdate();
			if (result>0) {
				System.out.println("삭제 성공");
			}
			
		}catch (Exception e) {
		e.printStackTrace();
			}finally {
					try {
			
					} catch (Exception e2) {
						e2.printStackTrace();
					}
			}

}
}
