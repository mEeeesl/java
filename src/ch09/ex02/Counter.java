package ch09.ex02;

public class Counter implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ": start.");
		
		for(char c = 'a'; c <= 'f'; c++) {
			System.out.println(Thread.currentThread().getName() + ": " + c);
			try {
				System.out.println(Thread.currentThread().getName() + ": sleep.");
				Thread.sleep(1000);
			} catch (InterruptedException eㅎ) {
				System.out.println(Thread.currentThread().getName() + ": end. 나 방해받아서 꺳어");
			}
		}
			
		System.out.println(Thread.currentThread().getName() + ": end.");
	}
}

/*
Runnable 에는 run이라는 method 1개만 있다.
Thread implements Runnable 이기에
run이 있다는건 Thread가 있다는 것
currentThread() -> Thread를 호출한 Thread를 읽을 수 있음




*/