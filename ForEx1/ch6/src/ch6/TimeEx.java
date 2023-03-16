package ch6;

public class TimeEx {

	public static void main(String[] args) {
		Time time=new Time();
		
		System.out.println("현재 시간");
		System.out.println(time.getHour()+":"+time.getMinute()+":"+time.getSecond());

		//원하는 시간으로 변경(setting)
		time.setHour(16);
		time.setMinute(39);
		time.setSecond(42);
		
		System.out.println("변경 후 시간");
		System.out.println(time.getHour()+":"+time.getMinute()+":"+time.getSecond());
	}
}
