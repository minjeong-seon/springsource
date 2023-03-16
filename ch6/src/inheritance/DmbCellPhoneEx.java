package inheritance;

public class DmbCellPhoneEx {

	public static void main(String[] args) {
		//부모 클래스 객체 생성
		CellPhone cellphone = new CellPhone();
		
		//자식 클래스 객체 생성
		DmbCellPhone dmbCellphone=new DmbCellPhone();
		dmbCellphone.model="자바폰";
		dmbCellphone.color="black";
		dmbCellphone.channel=7;
		
		//부모한테 상속받은 메소드 호출
		dmbCellphone.powerOn();
		dmbCellphone.turnOnDmb();
		dmbCellphone.changeChannelDmb(8);
		dmbCellphone.turnOffDmb();
		dmbCellphone.bell();
		dmbCellphone.sendVoive("여보세요");
		dmbCellphone.receiveVoive("안녕하세요");
		dmbCellphone.hangUp();
	}

}
