package ch6;

import java.util.Arrays;

//특문: ※ → ← ▼ ◀ ▶ ▲
public class TvExA {
	
	public static void main(String[] args) {
	//객체 배열 : 많은 수의 객체를 다뤄야 할 때 배열 처리
		int arr[] = new int[3];   //배열 변수 선언
		System.out.println(Arrays.toString(arr));  //배열 나열(확인)

		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		System.out.println(Arrays.toString(arr));
		
		int arr2[]={1,2,3};  //기본타입으로 인스턴스화
		//초기화 후 배열 나열
		System.out.println(Arrays.toString(arr));
	
		
		Tv[] tvArr=new Tv[3];  //참조타입으로 인스턴스화
		System.out.println(tvArr[0]);
		System.out.println(tvArr[1]);
		System.out.println(tvArr[2]);
		
		tvArr[0]=new Tv();
		tvArr[1]=new Tv();
		tvArr[2]=new Tv();
		System.out.println(tvArr[0].channel);
		System.out.println(tvArr[1].channel);
		System.out.println(tvArr[2].channel);
		
		//int arr2[]={1,2,3};
		Tv tvArr2[]= {new Tv(), new Tv(), new Tv()};
	}
}
