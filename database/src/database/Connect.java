package database;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * JDBC (; Java Database Connectivity)
 * -> 자바에서 데이터베이스에 접속할 수 있도록 제공해주는 자바 API
 * 
 * 1) connection 가져오기
 * 		-드라이버 로드
 * 		-연결문자열 연결 시도
 * 
 */

public class Connect {
	public static void main(String[] args) {
		Connection con = null;
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
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
