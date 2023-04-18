package mayday;

import java.util.Arrays;
import java.util.Scanner;

public class practice1 {
	public static void main(String[] args) {
	//프로그래머스 중앙값 구하기
		//주어진 배열을 크기순으로 정렬 : Arrays.sort()
		//중앙값 리턴
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [5];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}System.out.println(Arrays.toString(arr));
		
	
	}
}