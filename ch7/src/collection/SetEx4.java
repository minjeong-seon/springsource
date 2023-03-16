package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*TreeSet : 이진탐색 트리 + 성능 향상
 * ->이진 탐색 트리의 개념으로 데이터를 저장
 * ->정렬, 검색, 범위검색에 높은 성능을 보이는 자료 구조
 */

public class SetEx4 {
	public static void main(String[] args) {
		//hashCode와 달리 정렬을 하지 않아도 오름차순 정렬이 됨
		Set<Integer> set = new TreeSet<>();
		for (int i = 0; set.size()<6; i++) {
			int num=(int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println(set);

		//주어진 배열 값 중 50을 기준으로 큰 값(TreeSet 오른쪽)과 작은 값(TreeSet 왼쪽) 분류
		TreeSet<Integer> set2=new TreeSet<>();
		int score[] = {80,95,50,35,45,65,10,100};
		for (int i = 0; i < score.length; i++) {
			set2.add(score[i]);
		}
		System.out.println("50보다 작은 값: "+set2.headSet(50));
		System.out.println("50보다 큰 값: "+set2.tailSet(50));
		
		
		
		
		
		
	}

}
