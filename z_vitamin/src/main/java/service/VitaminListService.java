package service;

import java.util.List;

import domain.VitaminDTO;
import persistence.VitaminDAO;

public class VitaminListService {
	public List<VitaminDTO> list(){
		VitaminDAO dao = new VitaminDAO();
		List<VitaminDTO> list = dao.getList();
		
		return list;
		//return new VitaminDAO().getList();
		}
}
