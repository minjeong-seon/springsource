package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Map
 * 키(key) : 유일값
 * 값(Value) : 중복 가능
 * 
 * Map 인터페이스: key-value 쌍으로 이루어진 데이터 집합(순서 x, key는 중복 x, value는 중복 허용)
 *  	>>구현클래스: HashMap, TreeMap, HashTable, Properties,...
 */

public class MapEx1 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
//		//put(key, value): 요소 추가 (key 값이 동일하다면 나중에 추가한 요소만 남김)
//		map.put("myId","1234");
//		map.put("myId","4321");
//		map.put("myId","1945");
//		map.put("myId","2023");		
//		System.out.println(map);
		//key 값을 다르게 하여 모든 요소 확인하기
		map.put("myid1","1234");
		map.put("myid2","4321");
		map.put("myid3","1945");
		map.put("myid4","2023");		
		System.out.println(map);
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			//key에 해당하는 id 입력 받기
			System.out.println("아이디: ");
			String id = sc.nextLine().trim();	//입력값에 공백이 있는 경우, 공백 제거하기
			//map에 입력받은 id가 존재하지 않는 경우 "입력하신 ID는 존재하지 않습니다." 메시지 출력
			//메시지 출력 후 다시 id 입력 받기
			if (!map.containsKey(id)) {		//containsKey(): HashMap에 key를 포함하고 있는가?(value도 가능)
				System.out.println("입력하신 ID는 존재하지 않습니다. 다시 입력해 주세요.");
				continue;		//불일치로 이후 step을 실행할 필요가 없을 시 이전 실행 반복
			}
			//value에 해당하는 password 입력 받기
			System.out.println("비밀번호: ");
			String pw = sc.nextLine().trim();
			//입력받은 비번이 일치하는지 확인 후 일치하면 프로그램 종료
			//불일치 시 "다시 입력해 주세요." 메시지 출력 + 비번 다시 입력 받기
			if (!map.get(id).equals(pw)) {		//get(Object): key의 값을 리턴, 못 찾으면 null
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해 주세요.");
			}else {
				System.out.println("로그인 성공");
				break;
			}
		}
		//[해설] id = key, pw = value에 담김 |  if (!map.get(id).equals(pw)) 풀이
		// Map 인터페이스는 key-value 쌍으로 이루어진 데이터 집합이므로,
		// map.get(id) --> 이전에 입력받은 id(key)에 해당하는 pw(value)를 가져오면
		//	equals(pw) --> 사용자로부터 입력받은 pw value를 get으로 가져온 value와 비교한다.
		
		
		
		
		
		
		
		
	}
}
