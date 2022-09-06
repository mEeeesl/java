package ch01;

import java.util.Random;

public class Hello {
	public static void main(String[] args) {
		System.out.println("hello");
		
		Random random2 = new Random();
		
		boolean isRun = false;
		
		do{
			int ran = random2.nextInt();
			if(ran > 0) {
				System.out.println(ran);
				isRun = true;
			}
		} while(!isRun); 
	}
}
