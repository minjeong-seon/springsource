package shop2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor @NoArgsConstructor @Getter @Setter @ToString
//@Data //기본생성자, get/set, toString, canEqual, hashCode를 아우르는 하나의 단축키 (AllArgs는 x)
public class ProductDTO {	
	private int product_id;
	private String pname;
	private int price;
	private String content;
}
