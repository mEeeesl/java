package ch04.ex02;

import java.util.Scanner;

public class C05Random {
	public static void main(String[] args) {
		int a = (int)(Math.random() * 10) + 1;
		// 0.0 < Math.random(); < 1.0
		// 0 < (int)Math.random() * 10;  < 10
		// 1 < (int)(Math.random() * 10) + 1; < 11

		System.out.println(a);
	}
}
