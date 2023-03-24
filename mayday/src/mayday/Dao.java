package mayday;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Dao {
	private Connection con=null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
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
	
	public Dto getRow(int deptno) {
		con=getConnection();
		String sql = "select * from dept_temp where deptno=?";
		Dto dto = null;
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, deptno);
			rs=pstmt.executeQuery();
			if (rs.next()) {
				return new Dto(rs.getInt(1),rs.getString(2),rs.getString(3));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		return dto;
	}
	
	public ArrayList<Dto> getRows() {
		ArrayList<Dto> list = new ArrayList<>();
		try {
			con=getConnection();
			String sql = "select * from exam_dept";
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while (rs.next()) {
				list.add(new Dto(rs.getInt(1),rs.getString(2),rs.getString(3)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		return list;
	}
	
	
}
