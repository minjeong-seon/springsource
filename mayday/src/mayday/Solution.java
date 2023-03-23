
package mayday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//public class Solution {
//	//프로그래머스 코딩테스트 https://school.programmers.co.kr/learn/courses/30/lessons/120817
//	public double soulution(int[] numbers) {
//		return Arrays.stream(numbers).average().orElse(0);
//		//Arrays.stream() : Returns a sequential IntStream with the specified array as its source.
//		// ==>()안의 배열을 스트림으로 변환
//		//average(): Returns an OptionalDouble describing the arithmetic mean of elements of this stream, 
////			or an empty optional if this stream is empty. This is a special case of a reduction. 
//		// ==> 스트림에 저장된 요소들의 산술 평균을 리턴
//		//orElse(): If a value is present, returns the value, otherwise returns other.
//		// ==> 값이 있으면 해당 값을 리턴, 없으면 other를 리턴
//	}
	
	
	//프로그래머스 코딩테스트 https://school.programmers.co.kr/learn/courses/30/lessons/120830
	//양꼬치 10인분 먹으면 음료수 1개 서비스를 줄 때
	//양꼬치 1인분=12,000원 | 음료수 1개=2,000원
	//양꼬치 n인분과 음료수 k개 먹었을 때 얼마를 지불해야 하는가?
//	public int solution(int n, int k) {
//		      int answer = (n*12000)+(k*2000);
//		        if((n/10)>=1){
//		         answer-=((n/10)*2000);
//		        }
//		        return answer;
//	}
//
//}
//
////다른 사람 모범 답안
////class Solution {
////    public int solution(int n, int k) {
////        return n * 12000 + k * 2000 - (n / 10 * 2000);
////    }
////}
//
//class Solution1 {
//    public int solution(int[] array, int height) {
//      int answer=0;
//      for (int i = 0; i < array.length; i++) {
//			if (array[i]>height) {
//				answer++;
//			}
//		}
//        return answer;
//    }
//}

//문자열을 일정 길이로 잘라서 배열에 저장하고 출력하기

//class Solution3 {
//    public String[] solution(String my_str, int n) {
//        int fix = n;
//        //동일한 크기의 청크로 문자열을 분할하는 방법 : (?<=\\G.{5}) lookbehind
//        return my_str.split("(?<=\\G.{" + fix + "})");
//    }
//}
//
//import java.util.stream.IntStream;
//
//class Solution {
//    public String[] solution(String my_str, int n) {
//        return IntStream.range(0, (int) Math.ceil((double) my_str.length() / n))
//                .mapToObj(i -> my_str.substring(i * n, Math.min(my_str.length(), i * n + n)))
//                .toArray(String[]::new);
//    }
//}


//문자열 str1, str2가 매개변수로 주어집니다. str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.
//1 ≤ str1의 길이 ≤ 100
//1 ≤ str2의 길이 ≤ 100
//문자열은 알파벳 대문자, 소문자, 숫자로 구성되어 있습니다.
//class Solution {
//    public int solution(String str1, String str2) {
//        int answer=0;
//    	boolean a = str1.contains(str2);
//        if(a==true) answer=1;
//        else answer=2;
//        return answer;
//        //return (str1.contains(str2)? 1: 2); <-이거 하나로도 가능
//    }
//}



//영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, my_string을 모두 소문자로 바꾸고 
//알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
//import java.util.Arrays;
//class Solution {
//    public String solution(String my_string) {
//    	// 문자열을 소문자로 변환
//        my_string=my_string.toLowerCase();
//        // 문자열을 문자 단위로 배열에 저장
//        char mystrArr [] = my_string.toCharArray();
//        // 배열을 오름차순 정렬
//        Arrays.sort(mystrArr);
//        String answer="";
//        // 배열을 다시 문자열로 변환
//        answer= new String(mystrArr);
//        return answer;
//    }
//}
//다른 사람의 풀이
//import java.util.*;
//class Solution {
//    public String solution(String my_string) {
//        char[] c = my_string.toLowerCase().toCharArray();
//        Arrays.sort(c);
//        return new String(c);
//    }
//}



//연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다. 두 정수 num과 total이 주어집니다. 
//연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.
// 내 풀이 설명) 등차수열의 합 공식 활용: total=(num*(2*start+(num-1))/2)에서 최솟값 start를 추출하기
//class Solution {
//    public int[] solution(int num, int total) {
//    	int [] answer =new int [num];
//		int start =(2*total/num-(num-1))/2;
//		answer[0]=start;
//	    for (int i = 0; i < answer.length; i++) {
//	    	answer[i]=answer[0]+i;
//       }
//       return answer;
//    }
//}









