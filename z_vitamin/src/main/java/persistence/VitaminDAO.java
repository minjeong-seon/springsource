package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;

import javax.sql.DataSource;

import domain.VitaminDTO;

public class VitaminDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public Connection getConnection() {
		Context ctx;
		try {
			ctx = new InitialContext();
			DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/myoracle");
			con = ds.getConnection();
			con.setAutoCommit(false);	// ==> true 일 때, DML 실행 시 트랜잭션 관리 직접 함
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}return null;
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
	
	public void commit(Connection con) {
		try {
			con.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void rollback(Connection con) {
		try {
			con.rollback();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<VitaminDTO> getList(){
		List<VitaminDTO> list = new ArrayList<>();
		try {
			con=getConnection();
			String sql = "select * from vitamin";
			pstmt = con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				String productId = rs.getString("productId");
				String company = rs.getString("company");
				int price = rs.getInt("price");
				String description = rs.getString("description");
				String location = rs.getString("location");
				
				list.add(new VitaminDTO(productId, company, price, description, location));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		return list;
	}
	
	
}
