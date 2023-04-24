package user.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import user.domain.UserDTO;

// ~DAO : DB 작업
// DAO 메소드 작성 시
//		하나의 행 조회 : ~~DTO
//		여러 개의 행 조회 : List<~~DTO>()
//DTO : 테이블의 칼럼과 같은 역할(여러개/하나 행 다 가능)

public class UserDAO {

	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;

	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "javadb";
		String password = "12345";
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
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

	//insertPro.jsp
	public boolean insert(String username, String birthYear, String addr, String mobile) {
		boolean flag = false;

		con = getConnection();
		String sql = "INSERT INTO userTBL(no, username, birthYear, addr, mobile) ";
		sql += "VALUES(user_seq.NEXTVAL, ?,?,?,?)";

		// DML(insert, update, delete) 문 실행 시: executeUpdate(); 사용
		try {
			pstmt = con.prepareStatement(sql);
			// ? 입력받아 저장하기
			pstmt.setString(1, username);
			pstmt.setInt(2, Integer.parseInt(birthYear));
			pstmt.setString(3, addr);
			pstmt.setString(4, mobile);
			int count = pstmt.executeUpdate();

			if (count > 0)
				flag = true;
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return flag;
	}

	// 여러 행 조회
	public List<UserDTO> getList() {
		List<UserDTO> list = new ArrayList<>();
		try {
			con = getConnection();
			String sql = "select * from usertbl";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				int no = rs.getInt("no");
				String username = rs.getString("username");
				int birthYear = rs.getInt("birthYear");
				String addr = rs.getString("addr");
				String mobile = rs.getString("mobile");

				list.add(new UserDTO(no, username, birthYear, addr, mobile));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
	}

	// get.jsp
	public UserDTO getRow(int no) {
		UserDTO dto = null;
		try {
			con = getConnection();

			String sql = "select * from usertbl where no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				String username = rs.getString("username");
				int birthYear = rs.getInt("birthYear");
				String addr = rs.getString("addr");
				String mobile = rs.getString("mobile");

				dto = new UserDTO(no, username, birthYear, addr, mobile);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return dto;
	}

	// updatePro.jsp
	public boolean update(int no, String rename, String readdr, String remobile) {
		boolean flag = false;
		try {
			con = getConnection();

			String sql = "";

			if (rename != "" && readdr != "" && remobile != "") {
				// 이름, 주소, 폰번
				sql = "update usertbl set username=?, addr=?, mobile=?, where no=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, rename);
				pstmt.setString(2, readdr);
				pstmt.setString(3, remobile);
				pstmt.setInt(4, no);
			} else {
				// 셋 중 둘만 수정한 경우
				if (rename != "" && readdr != "") {
					// 이름, 주소
					sql = "update usertbl set username=?, addr=? where no=?";
					pstmt = con.prepareStatement(sql);
					pstmt.setString(1, rename);
					pstmt.setString(2, readdr);
					pstmt.setInt(3, no);
				} else if (rename != "" && remobile != "") {
					// 이름, 폰번
					sql = "update usertbl set username=?, mobile=? where no=?";
					pstmt = con.prepareStatement(sql);
					pstmt.setString(1, rename);
					pstmt.setString(2, remobile);
					pstmt.setInt(3, no);
				} else if (readdr != "" && remobile != "") {
					// 주소, 폰번
					sql = "update usertbl set addr=?, mobile=? where no=?";
					pstmt = con.prepareStatement(sql);
					pstmt.setString(1, readdr);
					pstmt.setString(2, remobile);
					pstmt.setInt(3, no);
				} else if (rename != "") {
					// 셋 중 하나만 수정한 경우
					// 이름만
					sql = "update usertbl set username=? where no=?";
					pstmt = con.prepareStatement(sql);
					pstmt.setString(1, rename);
					pstmt.setInt(2, no);
				} else if (readdr != "") {
					// 주소만
					sql = "update usertbl set addr=? where no=?";
					pstmt = con.prepareStatement(sql);
					pstmt.setString(1, readdr);
					pstmt.setInt(2, no);
				} else if (remobile != "") {
					// 번호만
					sql = "update usertbl set mobile=? where no=?";
					pstmt = con.prepareStatement(sql);
					pstmt.setString(1, remobile);
					pstmt.setInt(2, no);
				}
			}

			// update 성공 시 get.jsp로 페이지 이동
			int count = pstmt.executeUpdate();
			if(count>0)flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt);
		}
		return flag;
	}

	
	public boolean remove(int no) {
		boolean flag=false;
		try {
			con =getConnection();
			String sql = "delete from usertbl where no=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, no);
			int count = pstmt.executeUpdate();
			if(count>0)flag=true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}return flag;
	}
}
