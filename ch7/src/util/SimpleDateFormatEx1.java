package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*형식화 클래스
 * java.text 패키지
 * 
 */

public class SimpleDateFormatEx1 {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);

		SimpleDateFormat sdf=new SimpleDateFormat();
		System.out.println(sdf.format(date));
		
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-mm-dd HH:mm:SS");
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd E요일 a hh:mm:ss");
		System.out.println(sdf2.format(date));
		System.out.println(sdf3.format(date));
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat sdf5 = new SimpleDateFormat("yyyy/MM/dd");
		
		//예외(Exception)
		try {
			//parse() : 날짜 데이터의 출력 형식을 변환
			Date d=sdf4.parse("2023년 08월 09일");
			System.out.println(sdf4.format(d));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
