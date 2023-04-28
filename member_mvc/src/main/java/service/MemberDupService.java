package service;

import persistence.MemberDAO;

public class MemberDupService {
	public boolean duplicateId(String userid) {
		return new MemberDAO().duplicateId(userid); 
	}
}
