package com.spring.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)		// 테스트 코드가 스프링 프레임워크 안에서 실행됨을 의미
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/root-context.xml",
										"file:src/main/webapp/WEB-INF/spring/security-context.xml"})
public class MemberAuthTest {

	@Autowired
	private DataSource ds;
	
	// 테스트 메소드: parameter 없음, return type 없음(=void)
	@Test	// ==> test method 임을 알려줌
	public void test() {
		String sql = "insert into spring_member_auth(userid, auth) values(?,?)";
		
		for (int i = 0; i <50; i++) {
			try (
				Connection con = ds.getConnection();
					PreparedStatement pstmt = con.prepareStatement(sql)){

				//50명의 member 생성 => 일반 회원 20명, 매니저 20명, 관리자 10명
				if(i < 20) {
					pstmt.setString(1, "user"+i);
					pstmt.setString(2, "ROLE_MEMBER");
				}else if(i < 40) {
					pstmt.setString(1, "manager"+i);
					pstmt.setString(2, "ROLE_MANAGER");
				}else {
					pstmt.setString(1, "admin"+i);
					pstmt.setString(2, "ROLE_ADMIN");
				}
				
				pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
