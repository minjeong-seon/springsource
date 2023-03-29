package shop2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static shop2.JdbcUtil.*;

public class OrderDAO {
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//CRUD(create=insert, read=select, update, delete) 메소드 작성
	
	//장바구니에 담기(추가)
	public boolean insert(int user_id, int product_id) {
		boolean status=false;
		try {
			con = getConnection();
			String sql = "insert into sorder(order_id, user_id, product_id, orderdate) values(order_seq.nextval, ?, ?, sysdate)";
			
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, user_id);
			pstmt.setInt(2, product_id);
			int result=pstmt.executeUpdate();
			if (result>0) status = true;
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt);
		}
		return status;
	}
	
	//장바구니 조회
	public List<OrderDTO> carts(int user_id){
		List<OrderDTO> list = new ArrayList<>();
		try {
			con=getConnection();
			
			String sql = "select u.user_id, u.name, p.info, i.product_id, i.pname, price, i.content, o.orderdate " 
					+ "from suser u, paytype p, sorder o, product i "
					+ "where u.pay_no = p.pay_no and u.user_id = o.user_id and o.product_id = i.product_id "
					+ "and u.user_id = ?";
			
			// resultset 결과: user_id, name, info, product_id, pname,price,content, orderdate => oderDTO에 담기
			// UserDTO = user_id, name, info
			// ProductDTO = product_id, pname,price,content
			// OrderDTO = orderdate
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, user_id);
			rs=pstmt.executeQuery();
			while (rs.next()) {
				UserDTO uDto = new UserDTO();
				uDto.setUser_id(rs.getInt(1));
				uDto.setName(rs.getString(2));
				uDto.setType(rs.getString(3));
				
				ProductDTO pDTO = new ProductDTO();
				pDTO.setProduct_id(rs.getInt(4));
				pDTO.setPname(rs.getString(5));
				pDTO.setPrice(rs.getInt(6));
				pDTO.setContent(rs.getString(7));
				
				OrderDTO oDto = new OrderDTO();
				oDto.setUserDTO(uDto);	//oDTO 객체 하나로 uDTO, pDTO에 담긴 데이터를 줄줄이 불러오기 위함(MyChop-Check Out 메소드 참고)
				oDto.setProductDTO(pDTO);
				oDto.setOrderDate(rs.getDate(8));
				
				list.add(oDto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(con, pstmt, rs);
		}
		return list;
	}
	
	
	
}
