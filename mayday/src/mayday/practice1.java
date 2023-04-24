package mayday;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class practice1 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}for (int j = 0; j< i*2-1 ; j++) {
				System.out.print("☆");
			}System.out.println("");
		}
	
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 5-i; j++) {
				System.out.print(" ");
			}for (int j = 0; j< i*2+1 ; j++) {
				System.out.print("☆");
			}System.out.println("");
		}
	}
}