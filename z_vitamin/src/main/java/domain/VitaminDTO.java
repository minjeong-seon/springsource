package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor @NoArgsConstructor
@ToString @Getter @Setter
public class VitaminDTO {
	private String productId;
	private String company;
	private int price;
	private String description;
	private String location;
}
