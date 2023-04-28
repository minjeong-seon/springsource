package action;

public class VitaminActionFactory {
	//메소드(getInstance)에서 불러 쓸 수 있도록 필드 생성
	private static VitaminActionFactory vaf;
	//싱클톤 패턴 만들기 : 딴 데서 인스턴스화 못하게 여기서 private으로 생성자 막기
	private VitaminActionFactory() {};
	//외부에서 VitaminActionFactory 객체 필요 시 아래 메소드 호출하면 됨
	public static VitaminActionFactory getInstance() {
		if(vaf==null) {
			vaf=new VitaminActionFactory();
		}return vaf;
	}
	
	//~~액션한테 전달받은 이동방식 결과에 따라 페이지 지
	public VitaminAction action(String cmd) {
		VitaminAction action = null;
		if(cmd.equals("/list.do")) {
			action=new VitaminListAction();
		}
		
		return action;
	}
}

