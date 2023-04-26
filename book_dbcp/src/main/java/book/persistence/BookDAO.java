package book.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import book.domain.BookDTO;

public class BookDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//드라이버 로드

	//DB서버 연결 + commit
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
	
	//자원 해제(con, pstmt, rs)
	public void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//자원 해제(con, pstmt)
	public void close(Connection con, PreparedStatement pstmt) {
		try {
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//commit
	public void commit(Connection con) {
		try {
			con.commit();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
	}
	
	//rollback
	public void rollback(Connection con) {
		try {
			con.rollback();
		} catch (SQLException e) {			
			e.printStackTrace();
			}
	}
	
	//도서목록 조회-여러개
	public List<BookDTO> getList(){
		List<BookDTO> list = new ArrayList<>();
		
		try {			
			con = getConnection();
			String sql = "select code,title,writer,price from booktbl";
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
//				int code = rs.getInt("code");
//				String title = rs.getString("title");
//				String writer = rs.getString("writer");
//				int price = rs.getInt("price");
//				
				//list.add(new BookDTO(code, title, writer, price));
				
				BookDTO dto = new BookDTO();
				dto.setCode(rs.getInt("code"));
				dto.setTitle(rs.getString("title"));
				dto.setWriter(rs.getString("writer"));
				dto.setPrice(rs.getInt("price"));
				list.add(dto);				
			}
			
		} catch (Exception e) {			
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		return list;
	}
	
	
	// 도서 상세 조회
	// select * from booktbl where code=?
	public  BookDTO  getRow(int code) {
		BookDTO dto = null;
		
		try {
			
			con = getConnection();
			String sql = "select * from booktbl where code=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, code);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				code = rs.getInt("code");
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				int price = rs.getInt("price");
				String description = rs.getString("description");
				
				dto = new BookDTO(code, title, writer, price, description);				
			}			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(con, pstmt, rs);
		}
		
		return dto;
	}	
	
	
	//도서 정보 입력
	public boolean insert(BookDTO insertDTO) {
		boolean flag = false;
		try {
			con=getConnection();
			String sql = "insert into booktbl(code, title, writer, price, description) values(?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, insertDTO.getCode());
			pstmt.setString(2, insertDTO.getTitle());
			pstmt.setString(3, insertDTO.getWriter());
			pstmt.setInt(4, insertDTO.getPrice());
			pstmt.setString(5, insertDTO.getDescription());
			
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				flag=true;
				commit(con);
			}
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		}finally {
			close(con, pstmt);
		}
		return flag;
	}
	
	//도서 정보 수정(가격)
	public boolean update(int price, int code) {
		boolean flag = false;
		try {
			con = getConnection();
			
			String sql = "update booktbl set price =? where code=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, price);
			pstmt.setInt(2, code);
			int count = pstmt.executeUpdate();
			if(count>0) {
				flag=true;
				commit(con);
			}
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		}finally {
			close(con, pstmt);
		}
		return flag;
	}
	
	//도서 정보 삭제
	public boolean remove(int code) {
		boolean flag = false;
		try {
			con = getConnection();
			
			String sql = "delete from booktbl where code=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, code);
			int count = pstmt.executeUpdate();
			if(count>0) {
				flag=true;
				commit(con);
			}
		} catch (Exception e) {
			rollback(con);
			e.printStackTrace();
		}finally {
			close(con, pstmt);
		}
		return flag;
	}
	
	
	
}
