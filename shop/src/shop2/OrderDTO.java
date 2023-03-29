package shop2;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString

public class OrderDTO {
	private int order_id;
	private int user_id;
	private int product_id;
	private Date orderDate;
	
	//포함관계(초기화 후 사용가능)
	private UserDTO userDTO;
	private ProductDTO productDTO;

}
