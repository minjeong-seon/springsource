package shop2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static shop2.JdbcUtil.*;

public class UserDAO {
	private Connection con = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	/* JdbcUtil 메소드 호출하는 법
	 * 1) static 메소드이므로 클래스명.메소드명();
	 * 2) jdbcUtil 클래스 안 메소드가 모두 static이면 import static JdbcUtil.*; 삽입 후 => 메소드명();만 해도 ok
	 */
	
	public boolean insert(int user_id, String name, int pay_no) {
		boolean status = false;
		try {
			con=getConnection();
			
			String sql = "insert into suser(user_id, name, pay_no) values(?,?,?)";
			
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, user_id);
			pstmt.setString(2, name);
			pstmt.setInt(3, pay_no);
			
			int result = pstmt.executeUpdate();
			if(result>0) status=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt);
		}
		return status;
	}
	
	//전체 조회 -list
	public List<UserDTO> getList(){
		List<UserDTO> list = new ArrayList<>();
		try {
			con=getConnection();
			String sql = "select * from suser";
			
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while (rs.next()) {
//				UserDTO dto = new UserDTO(rs.getInt(1), rs.getString(2), rs.getInt(3));
//				list.add(dto);
				
				list.add(new UserDTO(rs.getInt(1), rs.getString(2), rs.getInt(3)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		return list;
	}
	
	
	
}
