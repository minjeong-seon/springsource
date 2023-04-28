package service;

import domain.MemberDTO;
import persistence.MemberDAO;

public class MemberRegisterService {
	public boolean register(MemberDTO dto) {
		MemberDAO dao = new MemberDAO();
		return dao.register(dto);
	}
}
