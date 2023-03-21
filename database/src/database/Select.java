package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import oracle.jdbc.proxy.annotation.Pre;

/*
 * JDBC (; Java Database Connectivity)
 * -> 자바에서 데이터베이스에 접속할 수 있도록 제공해주는 자바 API
 * 
 * 1) connection 가져오기
 * 		-드라이버 로드
 * 		-연결문자열 연결 시도
 * 
 * 2) DB서버에 접속해서 원하는 작업(CRUD) 하기
 * 		-CRUD(; Create, Read(=select), Update, Delete)
 * 
 */

public class Select {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;	//sql 문 전달
		ResultSet rs=null;	//sql 결과 저장(특히 select 결과 저장)
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			//jdbc:oracle:thin:@ <<- 는 고정
			//localhost:1521:xe <<- 오라클 서버가 설치된 경로-변경될 수 있음 (localhost = 내 컴퓨터)
			//1521 <<- 기본 port 번호(변경될 수 있음)
			//xe <<- 기본 sid 이름
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="scott";
			String password="TIGER";
			
			con = DriverManager.getConnection(url, user, password);
			if (con!=null) {
				System.out.println("연결되었습니다.");}	
			
			//emp 테이블에 있는 내용 가져오기 (sql developer에 입력한 코드 그대로~)
//			String sql = "select*from emp";
			String sql = "select * from emp where deptno=20";
			
			//서버로 sql 구문 전송
			pstmt=con.prepareStatement(sql);
			//전송된 sql 구문 실행 후 결과를 ResultSet이라는 (테이블 형태)객체에 저장 
			rs=pstmt.executeQuery();
			
			//rs.next() : ResultSet 객체 안에 행이 존재한다면 true, 없으면 false 리턴
			while (rs.next()) {
				System.out.println(rs.getString(1)+"\t");		//empno = NUMBER 타입이라서 getInt(열번호), getInt(열이름; empno) 입력
				//NEMBER타입은 getString으로 조회해도 상관없음
				System.out.println(rs.getString("ename")+"\t");		//ename = VARCHAR2
				System.out.println(rs.getString(3)+"\t");
				System.out.println(rs.getInt("mgr")+"\t");
				System.out.println(rs.getDate(5)+"\t");		//date타입은 getDate, getString 둘 다 가능하지만 getDate는 시분초 안 나옴
				System.out.println(rs.getInt(6)+"\t");
				System.out.println(rs.getInt(7)+"\t");
				System.out.println(rs.getInt("deptno")+"\n");
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
