package mayday;

import java.util.Arrays;

public class Practice5 {
	public static void main(String[] args) {
		int num=3, total=12;
		int [] answer =new int [num];
		int n = 0;
	       for (int i = 0; i < answer.length; i++) {
	    	   for (int j = 0; j <= num; j++) {
	     		   n=n+j;
	    		}
			answer[0]=total-n;
		} System.out.println(Arrays.toString(answer));
	
		for (int j = 0; j <= num; j++) {
 		   n=n+j;
		}System.out.print(n);
	}
}
