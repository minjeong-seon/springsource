package shop2;

public class OrderMain {

	public static void main(String[] args) {
		// orderdto 사용하기
		OrderDTO dto = new OrderDTO();
		
		//property(멤버변수)에 값을 세팅 : 1) 생성자 2) setter 메소드 사용
		// 1)
		dto.setOrder_id(1000);
		dto.setUserDTO(new UserDTO(100,"hong", 1, "card") );
		
		// 2)
		UserDTO userDTO = new UserDTO();
		userDTO.setUser_id(100);
		userDTO.setName("hong");
		userDTO.setPayNo(1);
		userDTO.setType("card");
		
		//property 값 조회
		// 1)
		System.out.println(dto.getOrder_id());
		System.out.println(dto.getUserDTO().getName());

		// 2)
		UserDTO getUser = dto.getUserDTO();
		System.out.println(getUser.getName());
		System.out.println(getUser.getType());
	}

}
