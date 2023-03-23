package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Practice {
	public static void main(String[] args) {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try {
		Class.forName("oracle.jdbc.OracleDriver")
		
		Stirng url = "jdbc:oracle:thin@localhost:1521:xe";
		String user = "hr";
		Stirng password = "hr";
		
		con=DriverManager.getConnection(url, user, password);
		if (con!=null) {
			System.out.println("연결이 완료되었습니다.");
		}
		Stirng sql = "select * from emp";
		
		pstmt = con.prepareStatement(sql);
		rs=pstmt.executeQuery();
		
		while (rs.next()) {
			System.out.println(rs.getInt(3)+"\t");
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	
	
	
	
	
	}

}
