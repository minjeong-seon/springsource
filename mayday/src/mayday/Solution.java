package mayday;

import java.util.Arrays;

public class Solution {
	//프로그래머스 코딩테스트 https://school.programmers.co.kr/learn/courses/30/lessons/120817
	public double soulution(int[] numbers) {
		return Arrays.stream(numbers).average().orElse(0);
		//Arrays.stream() : Returns a sequential IntStream with the specified array as its source.
		// ==>()안의 배열을 스트림으로 변환
		//average(): Returns an OptionalDouble describing the arithmetic mean of elements of this stream, 
//			or an empty optional if this stream is empty. This is a special case of a reduction. 
		// ==> 스트림에 저장된 요소들의 산술 평균을 리턴
		//orElse(): If a value is present, returns the value, otherwise returns other.
		// ==> 값이 있으면 해당 값을 리턴, 없으면 other를 리턴
	}
	
	
	//프로그래머스 코딩테스트 https://school.programmers.co.kr/learn/courses/30/lessons/120830
	//양꼬치 10인분 먹으면 음료수 1개 서비스를 줄 때
	//양꼬치 1인분=12,000원 | 음료수 1개=2,000원
	//양꼬치 n인분과 음료수 k개 먹었을 때 얼마를 지불해야 하는가?
	public int solution(int n, int k) {
		      int answer = (n*12000)+(k*2000);
		        if((n/10)>=1){
		         answer-=((n/10)*2000);
		        }
		        return answer;
	}

}

//다른 사람 모범 답안
//class Solution {
//    public int solution(int n, int k) {
//        return n * 12000 + k * 2000 - (n / 10 * 2000);
//    }
//}

class Solution1 {
    public int solution(int[] array, int height) {
      int answer=0;
      for (int i = 0; i < array.length; i++) {
			if (array[i]>height) {
				answer++;
			}
		}
        return answer;
    }
}