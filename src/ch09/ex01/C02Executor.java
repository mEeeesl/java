package ch09.ex01;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class C02Executor {
	public static void main(String[] args) {
		Runnable r1 = () -> {
			for(int i = 0; i < 10; i++)
				System.out.print(i + " ");
		};
		
		Runnable r2 = () -> {
			for(char c ='a'; c <= 'z'; c++)
				System.out.print(c + " ");
		};
		// ¡ã Runnable Å¸ÀÔ 2°³ ¸¸µë. 
		
		// ¡å Thread ¸¸µë
		Executor executor = Executors.newCachedThreadPool();
		executor.execute(r1);	//ThreadPool ¾È¿¡ Thread ³Ö¾î¹ö¸®±â
		executor.execute(r2);
		
	}
}
// Main Thread = r1, r2 °´Ã¼ ¸¸µë
// r1, r2 = r1 - 0 ~ 10 , r2 - a ~ z ±îÁö ¸¸µé¾î³¿ 