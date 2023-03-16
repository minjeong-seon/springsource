package lang;

/*자바에서 문자열 다루기
 * 1)String : immutable; 원본 문자열 변경 불가
 * 2)StringBuffer : 원본 문자열 변경 가능 / 멀티쓰레드 안전
 * 3)StringBuilder : 원본 문자열 변경 가능 / StringBuffer와 같으나 멀티쓰레드 부분만 제거된 클래스
 * 
 */

public class StringBufferEx1 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();  // initial capacity of 16 characters.(buffer 크기 기본 16)
		StringBuffer sb2 = new StringBuffer(100);  // buffer의 크기가 100
		StringBuffer sb3 = new StringBuffer("Hello");  // contains the same characters as the specified
		
		//StringBuffer sb4="Helloo"; 는 불가
		
		System.out.println(sb2);  //버퍼 안의 내용 없음
		System.out.println(sb3);  //Hello
		
		//append(): 원본 문자열 뒤에 버퍼 길이만큼 content 추가 가능
		sb2.append(false);
		sb2.append("abc");
		sb2.append('g');
		sb2.append(777);
		//sb2.append(false).append("abc").append(777); <--이렇게 바로 붙여도 됨
		System.out.println("append() : "+sb2);
		
		//equals()를 Object가 넘겨준 상태로(오버라이딩 되지 않은 상태) 사용
		StringBuffer sb4 = new StringBuffer("Hello");
		System.out.println("equals() : "+sb3.equals(sb4));  //false
		//buffer 값을 비교하려면 toString으로 변경
		String str1= sb3.toString();
		String str2= sb4.toString();
		System.out.println("String equals() : "+str1.equals(str2));
		
		//delete(int start, int end) :시작위치에서 끝위치-1 사이 문자를 제거하여 리턴
		StringBuffer sb5 = new StringBuffer("0123456");
		StringBuffer sb6 = sb5.delete(1, 5);
		System.out.println("sb5 "+sb6);
		System.out.println("sb6 "+sb6);
		
		//deleteCharAt(int index): 인덱스 위치의 문자만 제거하여 리턴
		sb5=new StringBuffer("0123456");
		sb6 = sb5.deleteCharAt(4);
		System.out.println("deleteCharAt(index): "+sb6);
		
		//insert(int offset, char c):offset 위치에 c값을 삽입
		sb5.insert(4, "-");
		System.out.println(sb5);
		
		//replace(int start, int end, String str): 시작위치~끝위치-1을 str로 바꿈
		sb5 = new StringBuffer("0123456");
		sb5.replace(0, 3, "code");
		System.out.println("replace(): "+sb5);
		
		//주어진 문자열 반대로 출력하기(For문+charAt 사용)**
		str2="0123456879";
		for (int i = str2.length()-1; i >= 0; i--) {
			System.out.print("거꾸로 For문+charAt 사용: "+str2.charAt(i));
		}
		
		System.out.println();
		
		//주어진 문자열 반대로 출력하기(reverse 사용)
		sb5=new StringBuffer(str2);
		System.out.println("reverse(): "+sb5.reverse());
		
		//setCharAt(int index, char ch): index 위치를 ch로 변경
		sb5=new StringBuffer("0123456");
		sb5.setCharAt(4, '&');
		System.out.println(sb5);
		
		
 }
}