package service;

import persistence.MemberDAO;

public class MemberLeaveService {
	public boolean deleteAccount(String userid, String password) {
		return new MemberDAO().delete(userid, password);
	}
}
