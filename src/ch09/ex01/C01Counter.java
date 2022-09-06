package ch09.ex01;

public class C01Counter {
	public static void main(String[] args) {
		System.out.println("main start.");
		
		Thread thread1 = new Thread(() -> {
			for(int i = 0; i < 10; i++)
				System.out.print(i + " ");
		});
		
		Thread thread2 = new Thread(() -> {
			for(char c = 'a'; c <= 'z'; c++)
				System.out.print(c + " ");
		});
		
		thread1.start();
		thread2.start();
		//thread1, 2는 동시 진행, 0 a b 1 2 3 4 c 5 d e 6 f g h 7 8 i j z l m n o 0 p ~
		//VM이 시분할을 자기 마음대로 해서 그런것
		
		System.out.println("main end.");
			
	}
}
/*
내가 쓰레드를 다룰일은 딱히 없음
WAS ( Web Application Server ) 여기서 알아서 쓰레드 실행시키기때문에
내가 WAS 회사에 들어가지 않는이상 굳이 쓰레드를 코딩할 일은 딱히 없다함  

Thread
.start();

main start
main end
0 1 2 3 4 5 6 7 8 9 가 출력됨 => start 다음에 나오는게 아니라 나중에나옴

process 
실체가 없는 객체, 자기만의 고유한 공간을 차지, 그 공간 내에서 어떠한 일을 처리함.

ex) 우리 몸의 신진대사처리 - process
ex) 식당 - 요리사, 서빙, 캐셔, 등 하나하나가 Thread다

지금까지는 순차적으로 실행했음 - 시퀀스(sequence) 실행

쓰레드 클래스를 이용해서 쓰레드 2개 이상 구현해볼거임

여기선 Main Thread와, thread1, thread2가 있음

Main Thread가 하는일 = 메인 실행하고 쓰레드 객체를 만듬. 그리고 스타트 호출( 실행시키는건아님 ) 그리고 메인 end 까지 실행
쓰레드스타트 되면 Thread1, Thread2가 실행됨

thread1, 2가 하는 일 = 0 ~ 9, a ~ y 


*/