package ch6;

//생성자 오버로딩
//			:생성자 이름은 같아야 함
//			:매개변수의 개수 또는 타입이 달라야 함

public class Calc2 {
	int add(int a, int b) {
		return a+b;
	}
	
	int add(int[]arr) {
		int result=0;
		for (int i = 0; i < arr.length; i++) {
			result+=arr[i];
		}return result;
	}
	
	float add(int a, float b) {
		return a+b;
	}
	
	long add(int num1, long num2) {
		return num1+num2;
	}
	
	long add(long num1, int num2) {
		return num1+num2;
	}
	
}
