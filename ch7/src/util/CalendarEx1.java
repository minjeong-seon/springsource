package util;
import java.time.Year;

/*날짜와 시간
 * 1. java.util.Calendar 클래스
 * 2. java.util.Date 클래스
 * 3. java.Time.LocalDate, java.Time.LocalTime, java.Time.LocalDateTime 클래스 (1.8에서 추가)
 */
import java.util.Calendar;

public class CalendarEx1 {
	public static void main(String[] args) {
		//Calendar 클래스: The Calendar class is an abstract class(추상클래스) 
		//-인스턴스 생성 불가(자식클래스를 만들어서 사용) 
		
		//현재 시스템의 날짜와 시간 정보 리턴
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		System.out.println(today.toString());
		
		//get(int field): 
		System.out.println("year: "+today.get(Calendar.YEAR));
		System.out.println("month: "+today.get(Calendar.MONTH));
		System.out.println("date: "+today.get(Calendar.DATE));
		System.out.println("AM/PM: "+today.get(Calendar.AM_PM));  //0은 오전 1은 오후
		System.out.println("hour: "+today.get(Calendar.HOUR_OF_DAY));
		System.out.println("minute: "+today.get(Calendar.MINUTE));
		System.out.println("second: "+today.get(Calendar.SECOND));
		
		System.out.println("현재 시간: "+today.getTime());
		System.out.println("1000분의 1초: "+today.get(Calendar.MILLISECOND));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
