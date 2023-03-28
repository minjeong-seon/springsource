package shop2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//생성자, get/set, toString => lombok 라이브러리 이용
@NoArgsConstructor @Getter @Setter @AllArgsConstructor @ToString
public class UserDTO {
	private int user_id;
	private String name;
	private int payNo;
	
}
