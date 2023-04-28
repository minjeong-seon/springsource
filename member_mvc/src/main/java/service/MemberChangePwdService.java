package service;

import domain.ChangeDTO;
import persistence.MemberDAO;

public class MemberChangePwdService {
	public boolean changepwd(ChangeDTO chgDto) {
		return new MemberDAO().changePwd(chgDto);
	}
}
