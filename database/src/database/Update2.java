package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update2 {
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
			
			//sc.nextLine(줄단위로 (enter 포함)읽어옴), sc.next(enter 전까지만 읽어옴) : String 입력 처리
			//sc.nextInt() : enter 전까지만 읽어옴
			
			System.out.println("부서번호 입력 >> ");
			int deptno = sc.nextInt();
			System.out.println("변경할 부서명 >> ");
			String dname = sc.next();
			//사용자의 입력을 받아 특정 부서의 부서명 변경
			String sql = "update dept_temp set dname=? where deptno=?";
			
			pstmt = con.prepareStatement(sql);
			// ? 에 대한 처리
			pstmt.setString(1, dname);
			pstmt.setInt(2, deptno);
			
			int result = pstmt.executeUpdate();
			if(result>0) {
				System.out.println("업데이트 성공");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
	}
}
