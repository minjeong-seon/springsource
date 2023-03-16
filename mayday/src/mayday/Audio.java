package mayday;

public class Audio extends Product{
	public Audio() {
		super(50);
	}
	
	//부모메소드인 product에서는 넘겨받을 toString이 없음
	//부모가 아닌 object 클래스에서 넘겨받은 것임
	//(=굳이 부모에 toString이 필요 없음)
	
	@Override
	public String toString() {
		return "Audio";
	}
}
